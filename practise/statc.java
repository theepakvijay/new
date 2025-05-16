package practise;
class cars{
    static int price=100;
int x=0;
static void meth1(){
    System.out.print(price);
}
}
public class statc {
    public static void main(String[] args) {
        cars honda=new cars();
        honda.meth1();
        System.out.print(cars.price);
    }
}
