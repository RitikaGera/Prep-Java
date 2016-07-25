import java.util.*;//Freeze777
public class Sbi implements ATM
{
	int bank_id=1;
	private int balance;
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void withdraw(int amount)
	{
	
		System.out.println("You have withdrawn"+amount);	
		balance=balance-amount;	
	}
	

	public void show_balance()
	{
		
		System.out.println(""+balance);
	}

	

	public static void main(String args[])
	{
		
		Sbi s=new Sbi();
		s.setBalance(2000);
		s.withdraw(200);
		//int bal=s.getBalance();
		//s.show_balance(bal);
		s.show_balance();
	}
	
}


class hdfc implements ATM
{
	int bank_id=2;
	
	private int balance=200;
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	public int getBalance()
	{
		return balance;
	}

	public void withdraw(int amount)
	{
		if(amount>balance)
			System.out.println("insufficient balance");
		else
			{
				System.out.println("You have withdrawn"+amount);
				balance=balance-amount;		
			}
	}
	
	
	public void show_balance()
	{
		System.out.println(""+balance);
	}
	
}

