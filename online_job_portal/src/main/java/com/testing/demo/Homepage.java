package com.testing.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/onlineJobPortal/")
public class Homepage {

	@RequestMapping("homepage")
	private String getHomePage()
	{
		return"home-page";
	}
}
