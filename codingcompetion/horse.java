import java.util.*;
public class horse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  value in following order thickness, breadth, diameter, rpm, arc, stress, density, coefficient of friction");
        double t = sc.nextDouble();
        double b = sc.nextDouble();
        double d = sc.nextDouble();
        int rpm = sc.nextInt();
        double arc = sc.nextDouble();
        double stress = sc.nextDouble();
        double density = sc.nextDouble();
        double coeff = sc.nextDouble();
        t/=10;
        breadth/=10;
        arc=Math.PI*arc/180;
        double maxtension=stress*t*b;
        double masspermeterlength=density*t*b*100;
        double v=Math.PI*d*rpm/(60*100);
        double centrifugaltension=masspermeterlength*v*v/10;
        double tensionontightside = maxtension-centrifugaltension;
        double power=(tensionontightside-centrifugaltension)*(1-(1/(Math.pow(Math.E,(coeff*arc)))))*v;
        power=power/75;
        System.out.printf("Power = %.3f HP",power);
    }
}