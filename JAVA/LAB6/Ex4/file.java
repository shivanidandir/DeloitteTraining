import java.util.*;
import java.io.*;
public class file {
	public static void main(String args[]) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter File name with location: ");
		String str = sc.next();
		File f = new File(str);
		System.out.println("This file is:"+(f.exists()?"Exists":"Does not exists"));
		System.out.println("Is file:"+f.isFile());
		System.out.println("File typeis: "+getFileExtension(f));
		System.out.println("Is Readable:"+f.canRead());
		System.out.println("IS Writable:"+f.canWrite());
		System.out.println("File Size:"+f.length()+"bytes");
		
	}
	private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}
