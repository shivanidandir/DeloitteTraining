

import java.util.Arrays;

public class empapp {

	public static void main(String[] args) {
		emp []emps=new emp[10];
		
		emps[0]=new emp(101,"Gargesh","manager");
		emps[1]=new emp(123,"Uttam","programmer");
		emps[2]=new emp(161,"Neel","salesman");
		emps[3]=new emp(171,"Nitin","data scientist");
		emps[4]=new emp(190,"Neema","data analyst");
		emps[5]=new emp(182,"Nikita","developer");
		emps[6]=new emp(166,"Poonam","digital marketer");
		emps[7]=new emp(152,"Punit","analyst");
		emps[8]=new emp(176,"Pratik","salesman");
		emps[9]=new emp(110,"Romil","watchman");
		
		
		Arrays.sort(emps);
		for(int i=0;i<emps.length;i++)
			System.out.println(emps[i]);	
		

	}

}
