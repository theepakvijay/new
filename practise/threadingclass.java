
package practise;
class example extends Thread{
    public void run(){
        int i=5;
        while(i>-15){
            System.out.print("hi");
            i--;
        }
    }
}
public class threadingclass {
    public static void main(String[] args) {
        example a=new example();
        a.start();
        int i=5;
        while(i>-15){
            System.out.print("ma");
            i--;
        }
    }

}

