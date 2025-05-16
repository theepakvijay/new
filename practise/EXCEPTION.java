package practise;
public class EXCEPTION {
    public static void main(String[] args) {
        int a=0,b=10;
        int c[]=new int[2];
        try {
            System.out.print(b/a);
            try{
            System.out.print(c[3]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.print("Index");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        finally{
            System.out.print("Final");
        }
        System.out.print("End");
    }
}
