package exercises;
import java.util.*;
public class prob2 {

		public static int calculateDifference(int n)
		{
			int diff=0;
			int sum=0,square=0;
			int s=0;
			for(int i=1;i<=n;i++)
			{
				sum+=(i*i);
			}
			for(int i=1;i<=n;i++)
			{
				s+=i;
			}
			square=s*s;
			
			diff= sum-square;
			return diff;
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println(calculateDifference(n));
		}
}
