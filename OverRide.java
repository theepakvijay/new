
class superclass{
    public int a;
    public int b;
    superclass(int a,int b){
        this.a=a;
        this.b=b;
       

    }
    void display(){
        System.out.println(a+" "+b);
    }
}
class sub extends superclass{
    public int c;
sub(int a,int b,int c){
    super(a,b);
    this.c=c;
}
@Override
void display(){
    System.out.println(a+" "+b+" "+c);
}

}
public class OverRide{
    public static void main(String[] args) {
        superclass a=new superclass(1,2);
        //a.print();
        a.display();
    }
}