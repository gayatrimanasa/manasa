package Javasample;

public class UsingArrays5 {

	public static void main(String[] args) {
	int[] a= {10,20,30,40,50};
	int[] b= {11,22,33,44,55};
	System.out.println("Initally:");
	System.out.println("/n/t a= ");
	for(int i:a)
	{
		System.out.println(i+"");
		
	}
	System.out.println("/n/t b=");
	for(int i:b)
	{
		System.out.println(i+"");
		
	}
	System .arraycopy(a, 3,b, 1,2);
	System.arraycopy(a, 1,b, 3, 2);
	System.out.println("/n After copying:");
	System.out.println("/n/t a=");
	for(int i:a)
	{
		System.out.println(i+"");
		
	}
	System.out.println("/n/t b=");
	for(int i :b)
	{
		System.out.println(i+"");
	}
	
		
	}
	}


