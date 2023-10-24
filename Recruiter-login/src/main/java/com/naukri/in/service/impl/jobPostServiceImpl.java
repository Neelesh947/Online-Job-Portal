package com.naukri.in.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naukri.in.model.JobPost;
import com.naukri.in.repository.jobPostRepository;
import com.naukri.in.service.jobPostService;


@Service
public class jobPostServiceImpl implements jobPostService{

	@Autowired
	private jobPostRepository jobPostRepo;
	
	public void saveJobPost(JobPost job) {
		jobPostRepo.save(job);
	}

	
	public List<JobPost> getJobList(JobPost post) {
		return jobPostRepo.findAll();
	}


	public void removejobPosted(int jobid) {
		jobPostRepo.deleteById(jobid);
	}

	public void updateJob(JobPost post) {
		jobPostRepo.save(post);
	}

	public JobPost getJobV(int jobid) {
		
		return jobPostRepo.findById(jobid).orElse(null);
	}


	
}
