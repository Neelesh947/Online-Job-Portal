package com.naukri.in.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class JobPost {

	@Id
	@GeneratedValue(generator = "job_seq")
	@SequenceGenerator(name = "job_seq", initialValue =10001 ,allocationSize = 1)
	private int jobid;
	private String jobtitle;
	private String jobdescription;
	private String joblocation;
	private String companyname;
	private String employementtype;
	private String Industrytype;
	private String functionalarea;
	private String experience;
	private String education;
	private String salaryrange;
	private String skills;
	private String applicationdeadline;
	private String contactinformation;
	private String openings;
	private String role;
	
	
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getEmployementtype() {
		return employementtype;
	}
	public void setEmployementtype(String employementtype) {
		this.employementtype = employementtype;
	}
	public String getIndustrytype() {
		return Industrytype;
	}
	public void setIndustrytype(String industrytype) {
		Industrytype = industrytype;
	}
	public String getFunctionalarea() {
		return functionalarea;
	}
	public void setFunctionalarea(String functionalarea) {
		this.functionalarea = functionalarea;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSalaryrange() {
		return salaryrange;
	}
	public void setSalaryrange(String salaryrange) {
		this.salaryrange = salaryrange;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getApplicationdeadline() {
		return applicationdeadline;
	}
	public void setApplicationdeadline(String applicationdeadline) {
		this.applicationdeadline = applicationdeadline;
	}
	public String getContactinformation() {
		return contactinformation;
	}
	public void setContactinformation(String contactinformation) {
		this.contactinformation = contactinformation;
	}
	public String getOpenings() {
		return openings;
	}
	public void setOpenings(String openings) {
		this.openings = openings;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	public String toString() {
		return "JobPost [jobid=" + jobid + ", jobtitle=" + jobtitle + ", jobdescription=" + jobdescription
				+ ", joblocation=" + joblocation + ", companyname=" + companyname + ", employementtype="
				+ employementtype + ", Industrytype=" + Industrytype + ", functionalarea=" + functionalarea
				+ ", experience=" + experience + ", education=" + education + ", salaryrange=" + salaryrange
				+ ", skills=" + skills + ", applicationdeadline=" + applicationdeadline + ", contactinformation="
				+ contactinformation + ", openings=" + openings + ", role=" + role + "]";
	}
	
	
	
	
}
