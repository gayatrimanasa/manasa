package Oops;
import java.util.Scanner;
interface IBankAccount
{
	double getBalance();
	void Depoist (double amt);
	boolean withdraw (double amt);
	
}
class SavingsAccount implements IBankAccount
{
private double lbalance;

	
		
	

	@Override
	public double getBalance() {
			return lbalance;
			
	}

	@Override
	public void Depoist(double amt) {
	lbalance=lbalance+amt;
	
		
	}
@Override
	public boolean withdraw (double amt)
	{
		
if(amt<=lbalance)
{
	lbalance=lbalance-amt;
	
	return true;
	
}
else
	return false;

	}
}


public class UsingInterfaceInheritance
{

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
SavingsAccount sObj=new SavingsAccount();
System.out.println("Inital Balance:"+sObj.getBalance());
System.out.println("Enter amount to Deposit:");
double damt = sc.nextDouble();
sObj.Depoist(damt);
System.out.println("After Deposting,Balance:"+sObj.getBalance());
System.out.println("Enter amount to withdraw :");
double wamt =sc.nextDouble();
boolean result=sObj.withdraw(wamt);
if(result==true)
{
	System.out.println("Afterwithdrawing , Balance:"+sObj.getBalance());
	
}

else
{
	System.out.println("In sufficient funds.with draw failed...");
	
}

	}

}
