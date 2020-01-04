
public class User1 {
	private String loginid;
	private String password;
	private String email;
	
	//constructor
	public User1(String loginid, String password, String email) {
		super();
		this.loginid = loginid;
		this.password = password;
		this.email = email;
	}
	
	
	//getters and setters
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//to string method
	@Override
	public String toString() {
		return "User1 [loginid=" + loginid + ", password=" + password + ", email=" + email + "]";
	}
	

}
