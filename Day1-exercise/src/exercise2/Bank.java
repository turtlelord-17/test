package exercise2;
import java.util.*;
public class Bank{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account obj = null;
		System.out.println("Choose from the following options");
		System.out.println("Enter 1 for SB-Account");
		System.out.println("Enter 2 for Current-Account");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			obj = new SBAccount();
			break;
		case 2:
			obj = new CurrAccount();
		}
		System.out.println("Choose from the following");
		while(true)
		{
			System.out.println("Enter 1 to deposit");
			System.out.println("Enter 2 to withdraw");
			System.out.println("Enter 0 to exit");
			int op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Enter the amount to deposit");
				int depositAmount = sc.nextInt();
				if(obj.deposit(depositAmount)) {
					System.out.println("Amount deposited");
				}
				break;
			case 2:
				System.out.println("Enter the amount to withdraw");
				int withdrawAmount = sc.nextInt();
				if(obj.withdraw(withdrawAmount)) {
					System.out.println("Take your amount");
				}
				else {
					System.out.println("Operation Denied");
				}
				break;
			default:
				System.out.println("Exiting now...");
				
			}
			if(op == 0)
			{
				System.out.println("Operation Exited!");
				break;
			}
			
		}
		
	}

}

abstract class Account {
	String accontNumber;
	String name;
	double amount;
	
	abstract boolean withdraw(int n);
	abstract boolean deposit(int n);
}

final class SBAccount extends Account {
		final int minBalance = 1000;
		public final  void interest() {
			this.amount += this.amount*.04;
		}
		public boolean withdraw(int n) {
			if(n>this.amount) {
				System.out.println("Amount greater than balance");
				return false;
			}
			if(this.amount-n<this.minBalance) {
				System.out.println("Cannot have less than"+this.minBalance+"in account");
				return false;
			}
			this.amount -= n;
			return true;
		}
		public boolean deposit(int n) {
			this.amount += n;
			return true;
		}
		
	}
 
final class CurrAccount extends Account {
		final int minBalance = 1000;
		public boolean withdraw(int n) {
			if(n>this.amount) {
				System.out.println("Rs."+n+" withdrawn.");
				this.amount -= n;
				System.out.println("Remaining balance is "+this.amount);
			}
			else{
				System.out.println("Rs."+n+" withdrawn.");
				this.amount -= n;
				System.out.println("Remaining balance is "+this.amount);	
			}
			return true;
		}
		public boolean deposit(int n) {
			this.amount += n;
			return true;
		}
	}
