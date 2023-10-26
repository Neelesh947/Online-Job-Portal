package com.naukri.in.userlogin.service;

import com.naukri.in.userlogin.model.User;

public interface UserService {

	boolean isUserExist(String uid);

	User getUser(String uid);

	void createAccount(User user);

	void updateUser(User user);

	void updatePassword(String pass, String attribute);

}
