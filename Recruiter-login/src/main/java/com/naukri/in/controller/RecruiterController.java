package com.naukri.in.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naukri.in.model.User;
import com.naukri.in.service.RecruiterService;

@Controller
@RequestMapping("recruiter/user")
public class RecruiterController {
	
	@Autowired
	private RecruiterService recruiterservice;
	
	
	@RequestMapping("/login")
	public String getLoginView()
	{
		return "user/login";
	}
	
	
	@RequestMapping("/create-account")
	public String createAccount(Model model)
	{
		model.addAttribute("user",new User());
		return "user/registration"; 
	}
	
	@RequestMapping("registerme")
	public String getRegisterRecruiter(User user, Model model)
	{
		String uid=user.getUserid();
		boolean isUserExist=recruiterservice.isUserExist(uid);
		
		if(isUserExist)
		{
			model.addAttribute("user",user);
			model.addAttribute("msg","User Already Exist");
			return "user/registration";
		}
		recruiterservice.createAccount(user);
		model.addAttribute("name",user.getName());
		return "user/registration_sucess";
	}
	
	
	@RequestMapping("authentication")
	public String getHomeView(String uid, String pass, Model model, HttpSession ses)
	{
		User user=recruiterservice.getUser(uid);
		if(user!=null)
		{
			String dpass=user.getPassword();
			if(dpass.equals(pass))
			{
				ses.setAttribute("name",user.getName());
				ses.setAttribute("userId", user.getUserid());
				return "redirect:home";
			}
			else
			{
				model.addAttribute("msg","Entered Password is wrong");
			}
		}
		else
			model.addAttribute("msg","Entered UserId does not exist");
			model.addAttribute("userId",uid);
				
		return "user/login";
	}
	
	@RequestMapping("logout")
	public String getLogoutView(Model model, HttpSession ses)
	{
		model.addAttribute("name",ses.getAttribute("name"));
		ses.invalidate();
		return "user/logout_sucess";
	}
}
