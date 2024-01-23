package abstraction;

import java.util.Scanner;

public class AtmUI {
   public static void main(String args[]) {
	   
	   IBank bank=new BankImp2();
	   
	   System.out.println("*** Welcome to ATM ***");
	   Scanner sc=new Scanner(System.in); // HAS  A RELATIOSHIP
	   
	   boolean flag=true;
	   while(flag) {
		   System.out.println("Enter 1 for Deposit");
		   System.out.println("Enter 2 for Withdraw");
		   System.out.println("Enter 3 for Exit");
		   int choice=sc.nextInt();
	   switch(choice) {
	   case 1 : bank.deposit();
		   break;
	   case 2: bank.withdraw();
		   break;
	   case 3:
		   flag=false;
		   System.out.println("Thank you");
		 break;
		 default:
			 break;
	   }
	   }
   }
}
