package demo.Model;

public class User {
	int UserId;
	String  UserName;
	
	public User(){
		
	}
	
	public User(int id,String name) {
		UserId=id;
		UserName=name;
		
	}
	
	void setUserId(int id) {
		UserId=id;
	}
	void setUserName(String name) {
		UserName=name;
	}
	public int getUserId() {
		return UserId;
	}
	public String getUserName() {
		return UserName;
	}
	

}
