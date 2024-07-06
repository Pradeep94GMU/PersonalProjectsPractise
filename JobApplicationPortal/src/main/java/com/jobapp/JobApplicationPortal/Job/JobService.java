package com.jobapp.JobApplicationPortal.Job;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobService {
    //only methods
    List<Job> findAll();
    String createJob(Job job);

    Job findJobById(Long id);
    boolean updateJob(Long id, Job job);
    String deleteJob(Long id);
}
