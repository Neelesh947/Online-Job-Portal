package com.naukri.in.userlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naukri.in.userlogin.model.JobPost;


@Repository
public interface JobSearchRepository extends JpaRepository<JobPost, Integer> {

}
