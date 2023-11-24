/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.service;

import com.example.newEdunavibackend.data.Course;
import com.example.newEdunavibackend.data.CourseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourse() {
        List<Course> course = courseRepository.findAll();
        return course;
    }

    public Course getCourseById(int id) {
        Optional<Course> crd = courseRepository.findById(id);
        return crd.get();
    }

    public Course createCourse(Course crd) {
        return courseRepository.save(crd);
    }

    public Course updateCourse(Course crd) {
        return courseRepository.save(crd);
    }

    public void deleteCourseById(int id) {
        courseRepository.deleteById(id);
    }
    
     //get values from course table using course name-------------------------
    public List<Course> findCourseByCourseName(String name) {
        return courseRepository.findCourseByCourseName(name);
    }

}
