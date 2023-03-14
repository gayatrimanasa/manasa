package Oops;
class Clsoverload
{


	public int Add (int i, int j, int k)
	{
		return (i+j+k);
		
	}
	public String Add(String s1 , String s2)
	{
		return (s1.concat(s2));
	}
}
public class Methodoverload {

	public static void main(String[] args) {
	Clsoverload Obj= new Clsoverload();
	System.out.println("the sum of the 100 and 300 is:"+ Obj.Add(100, 300,0));
	System.out.println("The addition of the 10,50 and 40 is :"+ Obj.Add(10 , 50,40));
	System.out.println("The concatenation of the 'java and 'program' is :"+ Obj.Add("java", "program"));
	
	}

}
