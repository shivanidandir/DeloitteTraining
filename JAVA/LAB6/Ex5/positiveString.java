import java.util.*;

public class positiveString {
	public static void main(String[] args)
	{
		int flag=1;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String n=str.toLowerCase();
		for(int i=0;i<str.length()-1;i++)
		{
			if(n.charAt(i)>n.charAt(i+1))
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("String is increasing");
		}
		else
		{
			System.out.println("String is not increasing");
		}
		sc.close();
	}
}
