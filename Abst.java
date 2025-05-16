abstract class example{
     abstract void meth1();
     abstract void meth2();
}
class example1 extends example{
    @Override
     void meth1(){
        System.out.println("meth1");
    }
     void meth2(){
        System.out.println("meth2");
    }
}
public class Abst {
    public static void main (String[] args){
        example a=new example1();
        a.meth1();
        a.meth2();

    }
    
}
