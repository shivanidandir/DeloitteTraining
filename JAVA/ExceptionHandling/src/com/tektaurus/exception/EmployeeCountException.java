package com.tektaurus.exception;

public class EmployeeCountException extends Exception{
	private String msg;
	public EmployeeCountException()
	{
	}
	public EmployeeCountException(String msg)
	{
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
				return "Count must be below 10 to accept any individual account request...";
		else
			return msg;
	}

}
