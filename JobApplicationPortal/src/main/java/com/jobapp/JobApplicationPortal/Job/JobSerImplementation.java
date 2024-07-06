package com.jobapp.JobApplicationPortal.Job;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobSerImplementation implements JobService {

    List<Job> listOfJob = new ArrayList<>();
    private Long countId = 1L;
    @Override
    public List<Job> findAll() {
        return listOfJob;
    }

    @Override
    public String createJob(Job job) {
        listOfJob.add(job);
        job.setId(countId);
        countId++;
        return "Job created successfully";
    }

    @Override
    public Job findJobById(Long id) {
        //logic to fetch a single job from List of best of Id

        //one approch: but not good when we need to find match based on some other
        //return listOfJob.get((int) (id - 1));

        //2nd approch , which is used by getters
        for(Job job : listOfJob){
            if(job.getId().equals(id)){
                return job;
            }
        }



        return null;
    }

    @Override
    public boolean updateJob(Long id, Job job) {
        //we need to find the Job with id first
        for(Job eachJob: listOfJob){
            if(eachJob.getId().equals(id)){
                //found our job, now we need to modify
                //we need modify data as well
                eachJob.setDescription(job.getDescription());
                eachJob.setLocation(job.getLocation());
                eachJob.setTitle(job.getTitle());
                eachJob.setMinSalary(job.getMinSalary());
                eachJob.setMaxSalary(job.getMaxSalary());
                return true;
            }
        }
        return false;
    }


    @Override
    public String deleteJob(Long id) {

        //before deleting, we need to find which is the job
        //using id we can find
        for(Job job: listOfJob){
            if(job.getId().equals(id)){
                listOfJob.remove(job);
                return "Job deleted successfully";
            }
        }
        return null;
    }
}
