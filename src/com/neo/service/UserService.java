package com.neo.service;

import com.neo.model.User;
import com.neo.model.SystemUser;

public interface UserService 
{
	public  boolean create(User user);
	/*public User getUserByName(String username);*/

	public User getUserByName(String uname);
}
