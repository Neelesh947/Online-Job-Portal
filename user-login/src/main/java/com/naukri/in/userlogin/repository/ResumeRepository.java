package com.naukri.in.userlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naukri.in.userlogin.model.ResumeUpload;

@Repository
public interface ResumeRepository extends JpaRepository<ResumeUpload, Integer> {

}
