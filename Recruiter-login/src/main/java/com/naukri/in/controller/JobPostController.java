package com.naukri.in.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naukri.in.model.Company;
import com.naukri.in.model.JobPost;
import com.naukri.in.model.User;
import com.naukri.in.service.CompanyService;
import com.naukri.in.service.jobPostService;


@Controller
@RequestMapping("/recruiter/user/")
public class JobPostController {

	@Autowired
	private jobPostService jobservice;
	
	@Autowired
	private CompanyService companyService;
	
	
	@RequestMapping("addjob")
	public String getJobPostView(Model model)
	{
		List<Company> companylist=companyService.getCompanyList();
		model.addAttribute("companylist", companylist);
		return "post_job/addJob";
	}
	
	@RequestMapping("save")
	public String saveJobPost(HttpSession ses, User user, Model model, JobPost job)
	{
		model.addAttribute("name",ses.getAttribute("name"));
		jobservice.saveJobPost(job);
		return"post_job/saveJob";
	}
	
	@RequestMapping("list")
	public String getListview(Model model, JobPost post)
	{
		List<JobPost> list=jobservice.getJobList(post);
		model.addAttribute("jobList",list);
		return "post_job/jobList";
	}
	
	@RequestMapping("remove")
	public String getRemoveJobPost(int jobid)
	{
		jobservice.removejobPosted(jobid);
		return "redirect:list";
	}
	
	@RequestMapping("edit")
	public String editJobPost(int jobid, Model model)
	{
		JobPost post=jobservice.getJobV(jobid);
		model.addAttribute("jobPost", post);
		return "post_job/editJob";
	}
	
	
	@RequestMapping("update")
	public String getEditsaveJobPost(JobPost post)
	{
		jobservice.updateJob(post);
		return "redirect:list";
	}
	
}
