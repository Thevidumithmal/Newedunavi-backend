/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.controller;


import com.example.newEdunavibackend.data.Job;
import com.example.newEdunavibackend.service.JobService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class JobController {
    
    @Autowired
    private JobService jobService;

    //get all values from job table-----------------------------------------
    @GetMapping(path = "/jobs")
    public List<Job> getAllJobs() {

        return jobService.getAllJob();
    }

    //get value using job id----------------------------------------------
    @GetMapping(path = "/jobs/{id}")
    public Job getJobById(@PathVariable int id) {

        return jobService.getJobById(id);
    }

    //create job part-----------------------------------------------------
    @PostMapping(path = "/jobs")
    public Job createJob(@RequestBody Job jrd) {

        return jobService.createJob(jrd);
    }

    //update job part----------------------------------------------------
    @PutMapping(path = "/jobs")
    public Job updateJob(@RequestBody Job jrd) {

        return jobService.updateJob(jrd);
    }

    //delete using job id------------------------------------------------
    @DeleteMapping(path = "/jobs/{id}")
    public void deleteJobById(@PathVariable int id) {

        jobService.deleteJobById(id);
    }
    
}
