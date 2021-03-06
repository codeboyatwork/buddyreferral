package com.syntel.br.dal;

import java.util.List;

import com.syntel.br.models.JobOpening;

public interface jobOpeningDao {

	boolean addJobOpening(JobOpening jo);//Adds a new job opening 
	boolean removeJobOpening(int jobCode);//Remove a job opening specified by the jobCode
	boolean updateJobOpening(JobOpening jo);//Updates a job opening 
	List<JobOpening> showJobOpenings();//Returns a List of All available Job Openings
	//apply();
	Double calculateReward(int jobCode);//to get the rewards from db where input is jobcode
	
}
