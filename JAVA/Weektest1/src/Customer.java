
public class Customer implements Comparable {
	int id;
	String name;
	String email;
	int phno;
	public Customer(){
		super();
	}
	public Customer(int id,String name,String email,int phno){
		this.id=id;
		this.name=name;
		this.email=email;
		this.phno=phno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	@Override
	public int compareTo(Object o) {
		Customer s=(Customer)o;
		
		return this.getId() - s.getId();
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}
	
}
