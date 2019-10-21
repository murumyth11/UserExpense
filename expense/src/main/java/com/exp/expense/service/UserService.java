package com.exp.expense.service;

import java.util.List;

import com.exp.expense.model.UserRegistration;

public interface UserService {


	public UserRegistration saveUser(UserRegistration userregistration);
	public List<UserRegistration> findall();
	public List<UserRegistration> showalluser();
	

}
