package com.jobapp.JobApplicationPortal.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    //it will be only handling the part to take request and call the service
    private JobService jobService;

    @Autowired
    public JobController(JobService jobService){
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> findAll(){
        List<Job> jobList =  jobService.findAll();
        if(jobList != null){
            return new ResponseEntity<>(jobList, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/jobs")
    public ResponseEntity<String> createPost(@RequestBody Job job){
        //pass to service to crete this job
         jobService.createJob(job);
         return new ResponseEntity<>("New Job Created..",HttpStatus.CREATED);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> findJobById(@PathVariable Long id){
        //have consistence response so use responseEntity
        Job job = jobService.findJobById(id);

        if(job != null){
            return new ResponseEntity<>(job, HttpStatus.OK);
        }
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);

    }

    //delete by ID
    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id){
        String res = jobService.deleteJob(id);
        if(res != null){
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
        return new ResponseEntity("No ID Found", HttpStatus.NOT_FOUND);
    }

    //update Job info

    @PutMapping("/jobs/{id}")
    public ResponseEntity<String> updateJobById(@PathVariable Long id, @RequestBody Job job){
        boolean updatedJob = jobService.updateJob(id, job);

        if(updatedJob){
            return new ResponseEntity<>("Job has been updated", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }



}
