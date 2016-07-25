public class hdfc implements ATM
{
	int bank_id=2;
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

