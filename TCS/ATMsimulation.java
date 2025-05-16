package TCS;
import java.util.*;
class ATMExceptions extends Exception{
    public ATMException (String name){
        super(name);
    }
}
class ATM{
    protected int initialamount;
 public ATM(int initialamount)throws ATMExceptions{
    if(initialamount<0){
    throw new ATMExceptions ("Amount should be greater than zero");
    }
    this.initialamount=initialamount;
    System.out.println("Your balance is "+initialamount);
 }
 public  void showmenu(){
   System.out.println("1. Check Balance");
   System.out.println("2. Deposite");
   System.out.println("3.Withdraw");
   System.out.println("4.exit");
   System.out.println("Choose an option");
}
public  void checkbalance(){
    System.out.println("Your current balance is "+initialamount);
}
public  void deposit(int depositeamount){
    initialamount+=depositeamount;
    System.out.println("Successfully deposited Rs"+depositeamount);
}
public  void withdraw(int withdrawamount){
    initialamount-=withdrawamount;
    System.out.println("Successfully taken"+withdrawamount);
}
public void select(int type,int amount){
    
switch(type){
    case 1:
    checkbalance();
    break;
    case 2:
   // System.out.println("the amount deposited sucessfully");
   // int depositeamount=sc.nextInt();
    deposit(amount);
    checkbalance();
    break;
    case 3:
    //System.out.print("Amount required");
   // int withdrawamount=sc.nextInt();
    withdraw(amount);
    checkbalance();
    break;

    }
}

}

public class ATMsimulation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        ATM Theepak=new ATM(0);
        Theepak.showmenu();
        System.out.println("Enter the amount to be withhdrawn or deposited");
        int type=sc.nextInt();
        int amount=sc.nextInt();
        Theepak.select(type,amount);
        }catch(ATMExceptions){
            System.out.println(e);
        }
      
        
        

    }
}

