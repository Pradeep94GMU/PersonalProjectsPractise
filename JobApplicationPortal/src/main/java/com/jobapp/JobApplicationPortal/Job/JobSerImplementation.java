package com.jobapp.JobApplicationPortal.Job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobSerImplementation implements JobService {

    //List<Job> listOfJob = new ArrayList<>();
    private Long countId = 1L;


    private JobRepo jobRepo;


    public JobSerImplementation(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    @Override
    public List<Job> findAll() {
        return jobRepo.findAll();
    }

    @Override
    public String createJob(Job job) {

        jobRepo.save(job);
        return "Job created successfully";
    }

    @Override
    public Job findJobById(Long id) {

        Job job =  jobRepo.findById(id).orElse(null);
        return job;
    }

    @Override
    public boolean updateJob(Long id, Job job) {
        //we need to find the Job with id first
        Optional<Job> jobOptional = jobRepo.findById(id);
        System.out.println("inside update");

        if(jobOptional.isPresent()){
            Job eachJob = jobOptional.get();
            System.out.println(eachJob.toString());
            System.out.println("inside update 2");
            eachJob.setDescription(job.getDescription());
            eachJob.setLocation(job.getLocation());
            eachJob.setTitle(job.getTitle());
            eachJob.setMinSalary(job.getMinSalary());
            eachJob.setMaxSalary(job.getMaxSalary());
            System.out.println("inside update 3");
            jobRepo.save(eachJob);
            return true;
        }

        return false;
    }


    @Override
    public String deleteJob(Long id) {

        //before deleting, we need to find which is the job
        //using id we can find
        Job job = jobRepo.findById(id).orElse(null);
        jobRepo.delete(job);
        return "Successfully deleted";

        //or other way is: jobRepo.deleteByID(id);////
    }
}
