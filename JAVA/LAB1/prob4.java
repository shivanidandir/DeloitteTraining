package exercises;
import java.util.*;
import java.math.*;
public class prob4 {

		public static boolean check(int n)
		{
			boolean flag=false;
			if(n>0)
			{
				if((n&n-1)==0)
				{
					flag=true;
				}
			}
			return flag;
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println(check(n));
		}
}
