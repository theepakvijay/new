package practise;
class single{
  private int b = 10;
  private static single a=null;
  private single(){
    System.out.print("Constructor");
  } 
  static single createobj(){
    if(a==null){
        a=new single();
    }
    return a;
  }
  void display(){
    System.out.print("Obejct method");
  }
}
public class SINGLETON {
    public static void main(String[] args) {
        single a=single.createobj();
        a.display();
    }
}
