package Javasample;
import java.util.Scanner;
public class UsingNestedifelse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter salary:");
		int sal=sc.nextInt();
		char grade;
		if(sal<20000)
		{
			grade = 'c';
			
		}
		
		else if(sal>20000 && sal<40000)
		{
			grade = 'B';
		}
			else
			{
		
		grade = 'A';
		
	}

        System.out.println("Grade for the given salary is:"+grade);
	}
    
	

	}





