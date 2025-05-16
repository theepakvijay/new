import java.util.*;

class coinflip {
    public static int randomFlip() {
       Random x=new Random();
       return x.nextInt(6)+1;
       
       
    }
       public static void coin(int n){
   //if(n==0){
     //   System.out.println("Head");
    //}else if(n==1){
      //  System.out.println("Tail");
    //}else{
        System.out.print(n+"  ");
    //}
}
}
public class Main{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

coinflip a=new coinflip();
for(int i=0;i<10;i++){
int n=a.randomFlip();
int m=a.randomFlip();
a.coin(n);
a.coin(m);
System.out.println();
       }
    }
}
