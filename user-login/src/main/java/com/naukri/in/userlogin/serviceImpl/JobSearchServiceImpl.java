package com.naukri.in.userlogin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naukri.in.userlogin.model.JobPost;
import com.naukri.in.userlogin.repository.JobSearchRepository;
import com.naukri.in.userlogin.service.JobSearchService;

@Service
public class JobSearchServiceImpl implements JobSearchService {

	@Autowired
	private JobSearchRepository jobsearchrepository;

	
	public List<JobPost> getjobList(JobPost post) {
		return jobsearchrepository.findAll();
	}


	public JobPost getDetailsofJob(int jobid) {
		JobPost post= jobsearchrepository.findById(jobid).orElse(null);
		return post;
	}
}
