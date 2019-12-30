import java.util.*;
public class ABCCorporation {
	
	int id;
	String name;
	String email;
	int phno;
	
	ABCCorporation(){
		super();
	}
	
	

	public static void main(String args[])
	{
		String ID="ABCCust";
		String Password="abc@123"; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id and password");
		String ID1=sc.next();
		String Pass=sc.next();
		int flag=0;
		
		Customer []cus=new Customer[10];
		
		cus[0]=new Customer(101,"Gargesh","manager@gmail.com",1234);
		cus[1]=new Customer(123,"Uttam","programmer@gmail.com",8976);
		cus[2]=new Customer(161,"Neel","salesman@gmail.com",4563);
		int i=3;
		
		if(ID1.equalsIgnoreCase(ID) && Pass.equalsIgnoreCase(Password))
		{
			flag=1;
		}
		else
		{
			flag=0;
		}
		if(flag==1){
			System.out.println(" Select an option\n1. Add Customer Details\n2. Print Customer Details\n3. Edit Existing Details\n4. Delete Existing Customer details\n5. Exit\n");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Add details of customer");
						int id=sc.nextInt();
						String name=sc.next();
						String email=sc.next();
						int phno=sc.nextInt();
						cus[i]=new Customer(id,name,email,phno);
						i++;
						break;
				case 2: 
						Arrays.sort(cus);
						for(int j=0;j<cus.length;i++)
						{
								System.out.println(cus[j]);	
						}
						
						break;
				case 3: System.out.println("Enter id to be edited");
						int ino=sc.nextInt();
						for(int j=0;j<cus.length;i++)
						{
							if(ino==cus[j].id)
							{
								
								System.out.println("Select option to be edited\n 1. name \n2. email\n3. phno\n");
								int c=sc.nextInt();
								switch(c)
								{
									case 1:	System.out.println("Enter new name\n");
											String name1=sc.next();
											cus[j].setName(name1);
											break;
									case 2: System.out.println("Enter new email\n");
										    String email1=sc.next();
										    cus[j].setEmail(email1);
										    break;
									case 3: System.out.println("Enter new name\n");
											int phno1=sc.nextInt();
											cus[j].setPhno(phno1);
											break;
									case 4: default:break;
								}
							}
							else
							{
								System.out.println("id does not exists");
							}
						}
						break;
				case 4: System.out.println("Enter id to be deleted");
						int inp=sc.nextInt();
						int flag1=0;
						int loc=0;
						for(int j=0;j<cus.length;i++)
						{
							if(inp==cus[j].id)
							{
								flag1=1;
								loc=j;
							}
							else
							{
								System.out.println("id does not exists");
							}
						}
						if(flag==1)
						{
							for(int k=loc+1;k<10;k++)
							{
								cus[k-1]=cus[k];
							}
						}
						break;
				case 5: 
			}
		}
		
	}
}
