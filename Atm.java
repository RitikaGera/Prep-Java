import java.util.*;
public interface ATM{
	//int bank_id;
	//these are global constants
	// we can have variables in interface, they have to be public,static,final-should not be changed like bank_id
	//enter pin,authenticate,ask money to withdraw
	abstract public void withdraw(int amount);
	abstract public int update_balance();
	abstract public void show_balance();
}

//whochever class implements an interface, it has to define the abstract methods of the interface
public class Sbi implements ATM
{
	int bank_id=1;
	public int balance=200;
	public void withdraw(int amount)
	{
	
		System.out.println("You have withdrawn"+amount);		
	}
	
	public  int update_balance()
	{
		balance=balance-amount;
		return balance;
	}

	public void show_balance()
	{
		System.out.println(""+balance);
	}

	

	public static void main(String args[])
	{
		System.out.println("Enter amount you want to withdraw");
		Scanner in=new Scanner();
		int amount=in.nextInt();
		SBI s=new SBI();
		s.withdraw(amount);
		s.update_balance();
		s.show_balance();
	}
	
}

public class hdfc implements ATM
{
	public void withdraw(int amount)
	{
		if(amount>balance)
			System.out.println("insufficient balance");
		else
			System.out.println("You have withdrawn"+amount);		
	}
	
	public  int update_balance()
	{
		if(balance>0)
			System.out.println("you have positive balance");
		balance=balance-amount;
		return balance;
	}

	public void show_balance()
	{
		System.out.println(""+balance);
	}
	
}


