import java.util.*; 

public class count {
	
	public static void main(String[] args){
		int lines=0;
		int chars=0;
		int words=0;
		Scanner sc=new Scanner(System.in).useDelimiter(",");
		String str=sc.next();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='\n')
				lines++;
			else if(str.charAt(i)==' ')
				words++;
			else 
				chars++;
		}
		
		System.out.println("No.of characters = "+chars);
		System.out.println("No.of words = "+(words+1));
		System.out.println("No.of lines = "+(lines+1));
		sc.close();
	}
}
