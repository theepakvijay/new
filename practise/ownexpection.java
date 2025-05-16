package practise;
class newexcept extends Exception{
    public String toString(){
        return " new exception";
    }
}
public class ownexpection {
    public static void  meth1() throws newexcept{
       
        System.out.print(1/0);
        throw  new newexcept();
    }
    public static void meth2() throws newexcept{
        meth1();
    }
    public static void main(String[] args) throws newexcept {
           try{
            meth2();
           }catch(newexcept e){
            System.out.print(e);
           }
    }
}
