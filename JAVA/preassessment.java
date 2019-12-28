import java.util.*;
import java.lang.*;
public class preassessment {

	public static String reverse(String r)
	{
		int l=r.length();
		String reverse="";
		for(int i=l-1;i>=0;i--)
		{
			reverse = reverse + r.charAt(i);
		}
		return reverse;
	}
	public static int count(String r)
	{
		int c=1;
		for(int i=0;i<r.length();i++)
		{
			if(r.charAt(i) ==' ')
			{
				c++;
			}
		}
		return c;
	}
	public static int vowel(String r)
	{
		int c=0;
		String vo=r.toLowerCase();
		for(int i=0;i<vo.length();i++)
		{
			if(vo.charAt(i)=='a'|| vo.charAt(i)=='e'|| vo.charAt(i)=='i'||vo.charAt(i)=='o'||vo.charAt(i)=='u')
			{
				c++;
			}
		}
		return c;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String r = sc.nextLine();
		System.out.println("Reverse:"+reverse(r));
		System.out.println("Words: "+count (r));
		System.out.println("Vowel: " +vowel(r));
		sc.close();
	}
}
