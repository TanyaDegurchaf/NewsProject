package by.htp.ll.bean;

import java.io.Serializable;

public class User  implements Serializable{
	private static final long serialVersionUID = -8943049598862583982L;
	
	private String login;
	private String password;
	private String email;
	private String nickname;
	private String role;
	
	public User() {}
	
	public User(String login, String password, String email, String nickname, String role) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
		this.nickname = nickname;
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	 @Override
	    public int hashCode() {
			int result = 1;
		 	result = 31 * result + (( login == null) ? 0 : login.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }

	        if (!(obj instanceof News)) {
				return false;
			}

	        User user = (User) obj;

	        return login != null && login.equals(user.login);
	    }

	    @Override
	    public String toString() {
	    	return "login: " + this.login + "\n" +
		            "password:" + this.password + "\n" +
					"email: " + this.email + "\n" + 
					"nickname: " + this.nickname + "\n" + 
					"role: " + this.role;
	    }
}
