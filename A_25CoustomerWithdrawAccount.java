package AssignmentModule_3_Corejava;
//W.A.J.P. to create a custom exception if Customer withdraw amount
//which is greater than account balance then program will show
//custom exception otherwise amount will deduct from account
//balance.
//Account balance is:2000
//Enter withdraw amount:2500
//Sorry, insufficient balance, you need more 500 Rs.
//To perform this transaction.
class InsufficientBalanceException extends Exception
{
	
}
class Bank
{
	
	double balance;
	public void checkbalance()
	{
		System.out.println("Your Current Balance : "+ balance);
	}
	
	public void deposit(double amount)
	{
		balance = balance+amount;
		
	}
	
	public void withdraw(double amount ) throws InsufficientBalanceException
	{
		if (amount>balance)
		{
			throw new InsufficientBalanceException();
			
		}
		
		else
		{
			balance = balance-amount;
			
			
		}
		
	}
	
}

public class A_25CoustomerWithdrawAccount {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.checkbalance();
		b.deposit(2000);
		b.checkbalance();
		try
		{
			b.withdraw(2500);
			
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
			System.out.println("Sorry, insufficient balance, you need more 500 Rs.");
		}
		b.checkbalance();
		
	}

}
