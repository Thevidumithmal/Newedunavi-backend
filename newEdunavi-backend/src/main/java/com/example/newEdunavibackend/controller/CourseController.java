/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.controller;

import com.example.newEdunavibackend.data.Course;
import com.example.newEdunavibackend.service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    //get all values from course table-----------------------------------------
    @GetMapping(path = "/courses")
    public List<Course> getAllCourses() {

        return courseService.getAllCourse();
    }

    //get value using course id----------------------------------------------
    @GetMapping(path = "/courses/{id}")
    public Course getCourseById(@PathVariable int id) {

        return courseService.getCourseById(id);
    }

    //create course part-----------------------------------------------------
    @PostMapping(path = "/courses")
    public Course createCourse(@RequestBody Course crd) {

        return courseService.createCourse(crd);
    }

    //update course part----------------------------------------------------
    @PutMapping(path = "/courses")
    public Course updateCourse(@RequestBody Course crd) {

        return courseService.updateCourse(crd);
    }

    //delete using course id------------------------------------------------
    @DeleteMapping(path = "/courses/{id}")
    public void deleteCourseById(@PathVariable int id) {

        courseService.deleteCourseById(id);
    }
    
     //get value from course table using course name---------------------------
    @GetMapping(path = "/courses", params = "name")
    public List<Course> findCourseByCourseName(@RequestParam String name) {
        return courseService.findCourseByCourseName(name);
    }

}
