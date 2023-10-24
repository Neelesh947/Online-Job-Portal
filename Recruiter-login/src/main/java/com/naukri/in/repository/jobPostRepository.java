package com.naukri.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naukri.in.model.JobPost;

@Repository
public interface jobPostRepository extends JpaRepository<JobPost, Integer>{

}
