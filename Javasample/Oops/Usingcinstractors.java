package Oops;
class Employee
{
	public int empId;
	public String empName;
	public Employee()
	{
		empId= 111;
		empName= "srikar";
		
	}
	public Employee(int id, String name)
	{
		empId= id;
		empName=name;
		
	}
	public void Dispaly()
	{
		System.out.println("Id:+empId");
		System.out.println("Name:+empName");
		System.out.println("******");
		
		
	}
}
public class Usingcinstractors {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.Dispaly();
		Employee e2=new Employee();
		e2.empId=100;
		e2.empName="Srikar";
		e2.Dispaly();
		Employee e3=new Employee (10,"manasa");
		e3.Dispaly();
		

	}

}
