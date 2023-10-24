package com.naukri.in.service;

import java.util.List;

import com.naukri.in.model.JobPost;

public interface jobPostService {

	void saveJobPost(JobPost job);


	void removejobPosted(int jobid);

	void updateJob(JobPost post);


	JobPost getJobV(int jobid);


	List<JobPost> getJobList(JobPost post);

}
