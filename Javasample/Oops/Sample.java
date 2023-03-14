package Oops;

public class Sample 
{
	public int i =10;
	public static int s=20;
	
	public int getsquare(int i)
	{
		return(i*i);
	
	}
public static double getPI()
{
	return(3.14);
	
}



	

	public static void main(String[] args) 
	{
		System.out.println("s = "+Sample.s);
		System.out.println("the 2PI value is :"+2*Sample.getPI());
		Sample obj=new Sample();
		System.out.println("i="+obj.i);
		System.out.println("the square of 6 is :"+ obj.getsquare(6));
	}
		
	}
	

	
	



