package Javasample;
import java.util.Scanner;

public class Usingscannerclass {

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int n1= Sc.nextInt();
	System.out.println("Enter numer:");
	int n2= Sc.nextInt();
	int res=n1-n2;
	System.out.println("the substraction of "+n1+" with "+n2+"is: " +res);
	
	}

}
