package com.naukri.in.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naukri.in.model.User;
import com.naukri.in.repository.RecruiterRepository;
import com.naukri.in.service.RecruiterService;

@Service
public class RecruiterServiceImpl implements RecruiterService {
	
	@Autowired
	private RecruiterRepository recruiterrepo;

	public boolean isUserExist(String uid) {
		return recruiterrepo.existsById(uid);
	}

	public void createAccount(User user) {
		recruiterrepo.save(user);		
	}

	public User getUser(String uid) 
	{
		User u=recruiterrepo.findById(uid).orElse(null);
		return u;
	}

	public void updateUser(User user) {
		recruiterrepo.save(user);
	}

	public void updatePassword(String pass, String uid) {
		recruiterrepo.updateUserPassword(pass,uid);
	}

	
}
