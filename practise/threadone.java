package practise;

public class threadone extends Thread {
    public  void run(){
        int i=15;
        while(i>-20){
            System.out.print("Hi");
            i--;
        }
    }
    public static void main(String[] args) {
        threadone a=new threadone();
        Thread b=new Thread(a);
         b.start();
        int i=15;
        while(i>-20){
            System.out.print("bt");
            i--;
        }
    }
    
}
