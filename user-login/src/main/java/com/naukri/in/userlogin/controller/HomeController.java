package com.naukri.in.userlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("naukri/user/")
public class HomeController
{
	@RequestMapping("home")
	public String getLoginView()
	{
		return "home/home_page";
	}
}
