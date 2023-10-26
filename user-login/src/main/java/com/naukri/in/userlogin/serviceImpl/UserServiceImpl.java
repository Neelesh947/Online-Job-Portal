package com.naukri.in.userlogin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naukri.in.userlogin.model.User;
import com.naukri.in.userlogin.repository.UserRepository;
import com.naukri.in.userlogin.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userrepo;

	public boolean isUserExist(String uid) 
	{
		return userrepo.existsById(uid);
	}

	@Override
	public User getUser(String uid) {
		User u=userrepo.findById(uid).orElse(null);
		return u;
	}
	
	public void createAccount(User user) 
	{
		userrepo.save(user);
	}
	
	public void updateUser(User user) 
	{
		userrepo.save(user);
	}
	public void updatePassword(String pass, String uid) 
	{
		userrepo.updateUserPassword(pass,uid);
	}

	
}
