package org.nhn.next.user;

import org.nhn.next.db.Database;

public class User {
	private String userId;
	private String password;
	private String name;
	private String email;
	
	public User(String userId, String password, String name, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}

	public String getUserId() {
		return userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public static boolean login(String userId, String password) throws UsersNotFoundException, PasswordMismatchException, UserEmptyException, PasswordEmptyException {

		User dbUser = Database.getUser(userId);
		
		// id가 null인 경우 오류처리 추가.
		
		if(userId.isEmpty()){
			throw new UserEmptyException("아이디를 입력하세요.");
		}
		
		if(dbUser == null){
			throw new UsersNotFoundException("아이디가 틀렸습니다. 다시 로그인하세요.");
		}
		
		// password가 null인 경우 오류처리 필요.
		if(password.isEmpty()){
			throw new PasswordEmptyException("비밀번호를 입력하세요.");
		}
		
		if( !password.equals(dbUser.getPassword()) ) {
			throw new PasswordMismatchException("비밀번호가 틀렸습니다. 다시 로그인하세요.");
		}
		return true;
	}
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name="
				+ name + ", email=" + email + "]";
	}
	
}
