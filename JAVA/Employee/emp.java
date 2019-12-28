

public class emp implements Comparable{
	private int empid;
	private String name;
	private String desg;
	
	
	public emp(int empid, String name, String desg) {
		this.empid = empid;
		this.name = name;
		this.desg = desg;
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdesg() {
		return desg;
	}
	public void setdesg(String desg) {
		this.desg = desg;
	}
	@Override
	public int compareTo(Object o) {
		emp s=(emp)o;
		String desg1=s.getdesg();
		String desg2=this.getdesg();
		
		return desg1.compareTo(desg2);
	}
	@Override
	public String toString() {
		return "Student [empid=" + empid + ", name=" + name + ", designation="
				+ desg + "]\n";
	}	

}
