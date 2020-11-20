package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
	@Autowired
	private JobRepository jobRepository;
	
	public Job addJob(Job candidat) {
		return jobRepository.save(candidat);
	}

	public Job updateJob(int id, Job newJob) {
		if (jobRepository.findById(id).isPresent()) {
			Job existingJob = jobRepository.findById(id).get();
			existingJob.setService(newJob.getService());
			existingJob.setEtat(newJob.getEtat());
			return jobRepository.save(existingJob);
		} else {
			return null;
		}
	}
	public Job updateEtatJob(int id, boolean newEtat) {
		if (jobRepository.findById(id).isPresent()) {
			Job existingJob = jobRepository.findById(id).get();
			existingJob.setEtat(newEtat);
			return jobRepository.save(existingJob);
		} else
			return null;
	}
	
	public String deleteJob(int id) {
		if (jobRepository.findById(id).isPresent()) {
			jobRepository.deleteById(id);
			return "Job supprimé";
		} else {
			return "Job nom supprimé";
		}
	}

}
