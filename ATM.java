import java.util.*;
public interface ATM{
	int bank_id=0;
	//these are global constants
	// we can have variables in interface, they have to be public,static,final-should not be changed like bank_id
	//enter pin,authenticate,ask money to withdraw
	abstract public void withdraw(int amount);
	abstract public void show_balance();
}

//whochever class implements an interface, it has to define the abstract methods of the interface

