package users;

public class Users {
	
	private int userId;
	private String login;
	private String passWord;
	private String role;
	
	
	public Users(int userId, String login, String passWord, String role) {
		super();
		this.userId = userId;
		this.login = login;
		this.passWord = passWord;
		this.role = role;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public String getRole(String role) {
		return role;
	}
	
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
