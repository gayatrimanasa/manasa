package Javasample;
import java.util.Scanner;
public class Usingifelse {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a numer;");
		int n= Sc.nextInt();
		if (n/2==0)
		{
			System.out.println("You entered Even number...");
			
		}
		else
		{
			System.out.println("you entered Odd number...");
		}
	}

}
