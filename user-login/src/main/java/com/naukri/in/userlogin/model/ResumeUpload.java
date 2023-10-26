package com.naukri.in.userlogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ResumeUpload {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int resumeid;
	@Lob
	private byte[] fileData;
	private String filename;
	public int getResumeid() {
		return resumeid;
	}
	public void setResumeid(int resumeid) {
		this.resumeid = resumeid;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
	
}
