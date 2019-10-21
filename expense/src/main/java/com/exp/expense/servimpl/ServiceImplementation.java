package com.exp.expense.servimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.exp.expense.model.UserRegistration;
import com.exp.expense.repository.UserRepo;
import com.exp.expense.service.UserService;
@Service

public class ServiceImplementation implements UserService {
 @Autowired
 UserRepo userrepo;
	@Override
	public  UserRegistration saveUser(UserRegistration userregistration) {
		return userrepo.save(userregistration);
		
	}
	@Override
	public List<UserRegistration> findall() {
		
		 
		return userrepo.findAll();
		

}
	
	
	public List<UserRegistration> showalluser()
	{
		List<UserRegistration> users=new ArrayList<UserRegistration>();
		for(UserRegistration userregistration: userrepo.findAll()) {
		users.add(userregistration);
				}
		return users;
		
		
	}
}
