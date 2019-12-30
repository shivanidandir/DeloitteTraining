
public class EmployeeException extends Exception{
	private String msg;
	public EmployeeException()
	{
	}
	public EmployeeException(String msg)
	{
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
				return "Salary should be greater than 3000";
		else
			return msg;
	}

}
