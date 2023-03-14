package Oops;
class company
{
	public String compName;
	public String compAdd;
	public company ()
	{
		compName= "Mindq system";
		compAdd="Hyderbad,india";
		
	}
	 public void Dispaly()
	 {
		 System.out.println("company Name:"+ compName);
		 System.out.println("company address:"+ compAdd);
		 
	 }
}
class Emp extends company
{
	public int empId;
	public String empName;
	public String Desig;
	@Override
	public void Dispaly()
	{
		System.out.println("Id:"+empId);
		System.out.println("Name:"+empName);
		System.out.println("Designaltion:"+ Desig);
		super.Dispaly();
	}
	
	  
}
public class UsingSingleInheritance {

	public static void main(String[] args)
	{
		
		Emp obj=new Emp();
		obj.empId=100;
		obj.empName="Srikar";
		obj.Desig= "Tester";
		obj.Dispaly();
		
		
		
	}
	

}
