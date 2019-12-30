
public class Employee {
	 int empid;
	 String name;
	 int salary;
	public Employee(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public void verifyApplication()throws EmployeeException{
		if(salary<3000)
			throw new EmployeeException("Salary should be greater than 3000");
		else
			System.out.println("Application registered successfully..");
	}
	public static void main(String[] args)
	{
		Employee p1=new Employee(1,"asd",16000);
		Employee p2=new Employee(2,"asf",19);
		try{
			p1.verifyApplication();
			p2.verifyApplication();
		}catch(EmployeeException e)
		{
			System.out.println(e);
		}
		
	}	
	 
	 
}
