package Javasample;
 import java.util.Scanner;
 
public class Usingifelse1 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		System.out.println("Enter salary:");
		int sal=Sc.nextInt();
		int asal ;
		if(sal>20000)
		{
			asal=12*sal;
			System.out.println("annual salary for given salary is:" +asal);
			
		}
		else
		{
			System.out.println("Salary must be more than 20000 to get annual salary...");
		}
		
	}

}
