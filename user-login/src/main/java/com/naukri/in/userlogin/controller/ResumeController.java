package com.naukri.in.userlogin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.naukri.in.userlogin.model.ResumeUpload;
import com.naukri.in.userlogin.repository.ResumeRepository;

@Controller
@RequestMapping("naukri/user")
public class ResumeController {

	@Autowired
	private ResumeRepository resumerepo;
	
	@RequestMapping("resume")
	private String getUploadResumeView()
	{
		return "resume/upload_resume";
	}
	
	@RequestMapping("upload")
	private String handleFileUpload(@RequestParam("resume")  MultipartFile resume, HttpSession ses,Model model)
	{
		try {
			ResumeUpload newresume=new ResumeUpload();
			newresume.setFileData(resume.getBytes());
			newresume.setFilename(resume.getOriginalFilename());
			resumerepo.save(newresume);
		}
		catch(Exception ex)
		{
			System.out.print(ex);
		}
		model.addAttribute("name", ses.getAttribute("name"));		
		return "resume/success";
	}
	
}
