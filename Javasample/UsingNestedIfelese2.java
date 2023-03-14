package Javasample;
 import java.util.Scanner;
 
public class UsingNestedIfelese2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter salary:");
		double sal=sc .nextDouble();
		double gsal;
		int comm;
		if (sal<20000)
		{
			comm=10;
			
		}
		else if(sal>20000&& sal<=50000)
			comm=20;
		else
		{
			comm=30;
			
		}
			gsal= sal+(comm*sal)/100;
			System.out.println("Gross salary for the given salary is:"+gsal);
	}

}
