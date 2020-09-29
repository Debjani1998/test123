


public class Employee {

	int id;
	String name;
	float salary;
	static int count;
	
	public Employee(String NAME,int ID,float SALARY)
	{
		count++;
		name=NAME;
		id=ID;
		salary=SALARY;
		System.out.println("CONSTRUCTER INVOKED");
	}
	public void showCount()
	{
		System.out.println("No. of object created= "+count);
		
	}
	
	public void setDetails(int ID,String NAME,float SALARY ) {
		
		id=ID;
		name=NAME;
		salary=SALARY;
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	public float getSalary()
	{
		return salary;
	}
	
	public void Display() {
		System.out.println("Details are: \n\nNAME- "+name+", \nID- "+id+" , \nSALARY- "+salary);
	}
}
