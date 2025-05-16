import java.util.*;
public class horespower2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double c=sc.nextDouble();
        c*=1000;
        double D=sc.nextDouble();
        double d=sc.nextDouble();
        double t0=sc.nextDouble();
        double m=sc.nextDouble();
        double coeff=sc.nextDouble();
        int rpm=sc.nextInt();
        t0*=1000;
        D*=1000;
        d*=1000;
        double v=Math.PI*d*rpm/(60*100);
        v/=10;
        double tc=m*v*v;
        double alpha=Math.asin((D-d)/(2*c));
        double theta=Math.PI-(2*alpha);
        
    }
    
}
