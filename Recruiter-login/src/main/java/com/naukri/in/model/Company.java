package com.naukri.in.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Company {
	
	
	@Id
	@GeneratedValue(generator = "company_seq")
	@SequenceGenerator(name = "company_seq",initialValue = 1001,allocationSize = 1)
	private int companyid;
	private String companyname;
	private String ownername;
	private String website;
	private String type;
	private String noofemployee;
	private String establish;
	private String mission;
	private String about;
	private String contactinformation;
	
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNoofemployee() {
		return noofemployee;
	}
	public void setNoofemployee(String noofemployee) {
		this.noofemployee = noofemployee;
	}
	public String getEstablish() {
		return establish;
	}
	public void setEstablish(String establish) {
		this.establish = establish;
	}
	public String getMission() {
		return mission;
	}
	public void setMission(String mission) {
		this.mission = mission;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getContactinformation() {
		return contactinformation;
	}
	public void setContactinformation(String contactinformation) {
		this.contactinformation = contactinformation;
	}

	
	
	
}
