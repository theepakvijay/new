package practise;
class example implements Runnable{
    public void run(){
        int i=20;
        while(i>0){
            System.out.print("Hi");
            i--;
        }
    }
}
public class runnableinterface {
    public static void main(String[] args) {
        example a=new example();
        Thread b=new Thread(a);
        b.start();
        int i=20;
        while(i>0){
            System.out.print("bg");
            i--;
        }
    }


}
