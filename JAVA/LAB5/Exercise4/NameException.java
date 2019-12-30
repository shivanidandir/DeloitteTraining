
public class NameException extends Exception{
	private String msg;
	public NameException()
	{
	}
	public NameException(String msg)
	{
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
				return "NAme should not be null";
		else
			return msg;
	}

}
