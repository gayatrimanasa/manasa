package Javasample;
import java.util.Scanner;


public class NumberPattern {

	public static void main(String[] args) {
	
Scanner	sc=new Scanner (System.in);
int i,j;
System.out.print("Entered L shape number rows=");
int rows= sc.nextInt();
System.out.print("printing L shape nuumber pattern");
for (i=rows; i>=1; i--)
{
	for(j=1; j<=1; j++)
	{
		System.out.print(j+"");
	}
	System.out.println();
	
}

	}

}
