import java.util.*;
import java.io.*;

public class line {
	public static void main(String args[]) throws IOException {
		int j = 1;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter File name with location: ");
		String str = sc.next();
		FileInputStream f = new FileInputStream(str);
		System.out.println("\nContents of the file are");
		int n = f.available();
		System.out.print(j + ": ");
		for(int i=0;i<n;i++)
		{
			ch=(char)f.read();
			System.out.print(ch);
			if(ch=='\n')
			{
				System.out.print(++j+":");
			}
		}
		sc.close();
	}
}
