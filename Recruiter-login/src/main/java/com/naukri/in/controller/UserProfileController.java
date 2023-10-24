package com.naukri.in.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naukri.in.model.User;
import com.naukri.in.service.RecruiterService;

@Controller
@RequestMapping("recruiter/user/profile")
public class UserProfileController 
{
	
	@Autowired
	private RecruiterService userservice;

	@RequestMapping("")
	public String getProfile(Model model,HttpSession ses) 
	{
		String userid = (String) ses.getAttribute("userId");
		User user=userservice.getUser(userid);
		model.addAttribute("user",user);
		ses.setAttribute("user",user);
		return "profile/user_details";
	}
	
	@RequestMapping("editprofile")
	public String getEditProfile(Model model,HttpSession ses) 
	{
		User user=(User)ses.getAttribute("user");
		model.addAttribute("user",user);
		return "profile/edit-details";
	}
	
	@RequestMapping("updateprofile")
	public String updateProfile(User user,Model model,HttpSession ses)
	{
		userservice.updateUser(user);
		ses.setAttribute("name",user.getName());
		model.addAttribute("msg","Your profile has been updated Successfully");
		return "profile/edit-details";
	}
	
	@RequestMapping("changepass")
	public String changePassword()
	{
		return "profile/change-password";
	}
	
	@RequestMapping("checkpass")
	public String checkPassword(String pass,HttpSession ses,Model model)
	{
		User user=(User)ses.getAttribute("user");	
		if(!user.getPassword().equals(pass))
		{
			model.addAttribute("msg", "Entered password is incorrect");
			return "profile/change-password";
		}
		ses.setAttribute("password",pass);
		return "profile/new-password";
	}
	
	@RequestMapping("updatepass")
	public String updatePassword(String pass,HttpSession ses,Model model)
	{
		if(pass.equals((String)ses.getAttribute("password")))
		{
			model.addAttribute("samep",1);
			model.addAttribute("msg", "This is your current password.Enter new password");
			return "profile/new-password";
		}
		model.addAttribute("samep",0);
		userservice.updatePassword(pass,(String)ses.getAttribute("userid"));
		User user=(User)ses.getAttribute("user");
		user.setPassword(pass);
		ses.setAttribute("password",pass);
		model.addAttribute("msg", "Password has been changed");
		return "profile/new-password";
	}

	
}
