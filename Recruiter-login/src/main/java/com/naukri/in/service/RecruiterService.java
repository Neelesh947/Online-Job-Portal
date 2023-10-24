package com.naukri.in.service;

import com.naukri.in.model.User;

public interface RecruiterService {

	boolean isUserExist(String uid);

	void createAccount(User user);

	User getUser(String uid);

	void updateUser(User user);

	void updatePassword(String pass, String uid);


}
