package com.naukri.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recruiter/user/")
public class HomeController {
	
	@RequestMapping("home")
	public String getHomeView()
	{
		return "home/home-page";
	}

}
