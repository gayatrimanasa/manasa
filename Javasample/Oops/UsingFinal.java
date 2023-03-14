package Oops;

class F1
{
	public int i=10;
	public void M1()
	{
		System.out.println("M1 method from F1 class ....");
		
	}
}
 class F2 extends F1
 {
	 @Override
	 public final void M1()
	 {
		 System.out.println("overrided M1 method from F2 class...");
		 
	 }
 }
	 class F3 extends F2
	 {
	//	@Override
	// public void  M1()
		 
	//	 {
	//	 System.out.println("overrided M1 method from F3 class...");
			 
		 
	 
 }
 
public class UsingFinal {

	public static void main(String[] args)
	{
		F3 obj=new F3();
		
		System.out.println("Intially , i="+obj.i);
		obj.i=100;
System.out.println("After modification,i="+obj.i);
		obj.M1();
	}		
		
	
	

}


