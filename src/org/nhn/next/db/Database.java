package org.nhn.next.db;

import java.util.HashMap;
import java.util.Map;

import org.nhn.next.user.User;

public class Database {
	private static Map<String, User> users = new HashMap<String, User>();
	
	public static void addUser(User user){
		users.put(user.getUserId(), user);
	}
	
	public static User getUser(String userId) {
		return users.get(userId);
	}
	
}
