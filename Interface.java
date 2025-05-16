interface teacher{
     void Name();
} 
interface  student{
    public void marks();
    public void name();
}
class student1 implements student,teacher{
    @Override
    public void marks(){
        System.out.println("marks");
    }
    @Override
    public void name(){
        System.out.print("Name");
    }
    @Override
    public void Name(){
        System.out.print("teacher name");
    }
}
public class Interface{
    public static void main(String[] args){
        student1 a=new student1();
        a.marks();
        a.name();
        a.Name();
    }
    
}
