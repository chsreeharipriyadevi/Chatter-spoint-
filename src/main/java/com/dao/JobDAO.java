package com.dao;


import java.util.List;
import com.model.Job;

public interface JobDAO 
{
	void saveJob(Job job);
	List<Job> getAllJobs();
	Job getJobById(int id);
}