package exercises;
import java.util.*;
public class prob3 {

		public static boolean checkNumber(int n)
		{
			boolean flag=true;
			int curr=n%10;
			n=n/10;
			while(n>0)
			{
				if(curr<=n%10)
				{
					flag=false;
					break;
				}
				curr=n%10;
				n=n/10;
			}
			return flag;		
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n= sc.nextInt();
			System.out.println(checkNumber(n));
			sc.close();
		}
}
