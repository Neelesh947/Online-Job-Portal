package com.naukri.in.userlogin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naukri.in.userlogin.model.User;
import com.naukri.in.userlogin.service.UserService;

@Controller
@RequestMapping("naukri/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	private String getLoginView()
	{
		return "user/login";
	}
	
	@RequestMapping("/create-account")
	public String getRegistrationView(Model model)
	{
		model.addAttribute("user", new User());
		return "user/registration";
	}
	
	@RequestMapping("registerme")
	public String createUserAccount(User user, Model model)
	{
		String uid=user.getUserid();
		boolean UserExist=userService.isUserExist(uid);
		if(UserExist)
		{
			model.addAttribute("user",user);
			model.addAttribute("msg","User Already Exist");
			return "user/registration";
		}
		userService.createAccount(user);
		model.addAttribute("name", user.getName());
		return "user/registration_sucess";
	}
	
	
	@RequestMapping("authentication")
	public String getAuthentication(String uid, String pass, Model model, HttpSession ses)
	{
		User user=userService.getUser(uid);
		if(user!=null)
		{
			String dpass=user.getPassword();
			if(pass.equals(dpass))
			{
				ses.setAttribute("name", user.getName());
				ses.setAttribute("userId",user.getUserid());
				return "redirect:home";
			}
			else
			{
				model.addAttribute("msg","Entered Password is Wrong");
			}
		}
		else
			model.addAttribute("msg","Entered userId does not exist");
		model.addAttribute("userId",uid);
		
		return "user/login";
	}
	
	@RequestMapping("logout")
	public String logoutUser(HttpSession ses,Model model)
	{
		model.addAttribute("name",ses.getAttribute("name"));
		ses.invalidate();
		return "user/logout_sucess";
	}
}
