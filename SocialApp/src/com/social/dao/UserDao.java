package com.social.dao;

import com.social.app.DataStore;
import com.social.entities.User;

public class UserDao {

	public User[] getUsers() {
		
		return DataStore.getUsers();
	}
	
}
