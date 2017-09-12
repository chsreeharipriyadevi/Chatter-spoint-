package com.model;

import java.util.Date;

public class Job {

	private int JobID;
	private String JobProfile,JobDesc,Qualificatin,Status;
	public Date PostDate;
	public int getJobID() {
		return JobID;
	}
	public void setJobID(int jobID) {
		JobID = jobID;
	}
	public String getJobProfile() {
		return JobProfile;
	}
	public void setJobProfile(String jobProfile) {
		JobProfile = jobProfile;
	}
	public String getJobDesc() {
		return JobDesc;
	}
	public void setJobDesc(String jobDesc) {
		JobDesc = jobDesc;
	}
	public String getQualificatin() {
		return Qualificatin;
	}
	public void setQualificatin(String qualificatin) {
		Qualificatin = qualificatin;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getPostDate() {
		return PostDate;
	}
	public void setPostDate(Date postDate) {
		PostDate = postDate;
	}
	
}
