package com.naukri.in.userlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naukri.in.userlogin.model.AppliedJob;
import com.naukri.in.userlogin.model.JobPost;
import com.naukri.in.userlogin.repository.AppliedJobRepository;
import com.naukri.in.userlogin.service.JobSearchService;

@Controller
@RequestMapping("naukri/user")
public class SearchJobController {

	@Autowired
	private JobSearchService jobsearchservice;
	
	@Autowired
	private AppliedJobRepository appliedrepository;
	
	@RequestMapping("joblist")
	public String getNaukriList(Model model, JobPost post)
	{
		List<JobPost> jobpost=jobsearchservice.getjobList(post);
		model.addAttribute("jobpost", jobpost);
		return "search_job/job_list";
	}
	
	
	@RequestMapping("applyjob")
	public String saveAppliedJob(int jobid)
	{
		JobPost job=jobsearchservice.getDetailsofJob(jobid);
		if(job!=null)
			{
				AppliedJob appliedjob=new AppliedJob();
				appliedjob.setJobid(job.getJobid());
				appliedjob.setRole(job.getJobtitle());
				appliedjob.setApplicationdeadline(job.getApplicationdeadline());
				appliedjob.setCompanyname(job.getCompanyname());
				appliedjob.setContactinformation(job.getContactinformation());
				appliedjob.setEducation(job.getEducation());
				appliedjob.setEmployementtype(job.getEmployementtype());
				appliedjob.setExperience(job.getExperience());
				appliedjob.setFunctionalarea(job.getFunctionalarea());
				appliedjob.setIndustrytype(job.getIndustrytype());
				appliedjob.setJobdescription(job.getJobdescription());
				appliedjob.setJoblocation(job.getJoblocation());
				appliedjob.setOpenings(job.getOpenings());
				appliedjob.setRole(job.getRole());
				appliedjob.setSalaryrange(job.getSalaryrange());
				appliedjob.setSkills(job.getSkills());
				appliedrepository.save(appliedjob);
			}
		return "redirect:viewAppliedJob";
	}
	
	
	@RequestMapping("viewAppliedJob")
	public String getJobAppliedView(Model model)
	{
		List<AppliedJob> appliedjob=appliedrepository.findAll();
		model.addAttribute("appliedjob", appliedjob);
		return "search_job/applied_job";
	}
}
