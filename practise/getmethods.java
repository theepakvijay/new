
class Exe extends Thread{
    public Exe(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY+3);
    
    }
    @Override
public void run(){
    int i=20;
   
    while(i>0){
    System.out.println("run");
    i--;
    try {
        Thread.sleep(1000);
    } catch ( Exception e) {
        System.out.print(e);
    }
    }
} 
}
public class getmethods {
    public static void main(String[] args) {
        Exe a=new Exe("theepak thread");
        
        int i=10;
        a.start();
        while(i>0){
            System.out.print("hi");
            i--;
        }
       
       System.out.print(a.getPriority());
        System.out.print(a.getState());
       System.out.print(a.getName());
        
    }
    
}
