package Javasample;
import java.util.Scanner;
public class email {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter email");
		String email= Sc.next();
		if(email.endsWith("@gmail.com"))// (email.endsWith("@yaahoo.com"))
		{	
			System.out.println("VALID email entered...");
			
		}
		else
		{
			System.out.println("INVALID email entered...");
		}
	}

}
