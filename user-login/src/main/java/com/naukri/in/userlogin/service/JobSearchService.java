package com.naukri.in.userlogin.service;

import java.util.List;

import com.naukri.in.userlogin.model.JobPost;

public interface JobSearchService {

	List<JobPost> getjobList(JobPost post);

	JobPost getDetailsofJob(int jobid);


}
