package com.sentek.springbootjwt.service;

import java.util.List;

import com.sentek.springbootjwt.domain.Role;
import com.sentek.springbootjwt.domain.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	
	void addRoleToUser(String username,String rolename);
	User  getUser(String username);
	List<User> getUsers();
}
