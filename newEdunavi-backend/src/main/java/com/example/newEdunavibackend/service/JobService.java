/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.service;

import com.example.newEdunavibackend.data.Job;
import com.example.newEdunavibackend.data.JobRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class JobService {
    
     @Autowired
    private JobRepository JobRepository;

    public List<Job> getAllJob() {
        List<Job> jobs = JobRepository.findAll();
        return jobs;
    }

    public Job getJobById(int id) {
        Optional<Job> jrd = JobRepository.findById(id);
        return jrd.get();
    }

    public Job createJob(Job jrd) {
        return JobRepository.save(jrd);
    }

    public Job updateJob(Job jrd) {
        return JobRepository.save(jrd);
    }
    
     public void deleteJobById (int id){
          JobRepository.deleteById(id);
      } 
}
