package Oops;
class clsMethods
{
	public void swap(int i,int j)
	{
		System.out.println("intially: first number= "+i+" ,second number:"+j);
		int temp=i;
		i=j;
		j=temp;
		System.out.println("After swaping;first number ="+i+",second number= "+j+"");
				
				
		
	}
	public int Add(int i,int j)
	
	{
		return(i+j);
		
		
	}
	  
}
public class Usingmethod {

	public static void main(String[] args) {
	
clsMethods obj=new clsMethods ();

obj.swap(10,20);
int result=obj. Add(10,20);
System.out.println("The sum of 10 and 20 is:"+result );
System.out.println("The square of "+result+"is:"+result);

	}

}
