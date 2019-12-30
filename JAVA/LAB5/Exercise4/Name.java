
public class Name {
	String FirstName;
	String LastName;
	static Name[] p=new Name[5];
	public Name(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public static boolean isStringOnlyAlphabet(String str) 
	{ 
	    return ((!str.equals("")) 
	            && (str != null) 
	            && (str.matches("^[a-zA-Z]*$"))); 
	}
	public static void verifyApplication(Name n) throws NameException{
		if(!isStringOnlyAlphabet(n.FirstName)||!isStringOnlyAlphabet(n.LastName))
			throw new NameException("Firstname and lastname shouldn't be null or should contain only alphabet");
		else
			System.out.println("Application registered successfully..");
		
		for(int k=0;k<p.length;k++){
			if(p[k]==null){
				p[k]=n;
				return;
			}
		}
	}
	public static void main(String[] args)
	{
		Name p1=new Name("bvc","qwe");
		Name p2=new Name("asf","poi");
		Name p3=new Name("rg23re","edfe");
		Name p4=new Name("dfd","bf");
		
		try{
			verifyApplication(p1);
			verifyApplication(p2);
			verifyApplication(p3);
			verifyApplication(p4);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}	
	
}
