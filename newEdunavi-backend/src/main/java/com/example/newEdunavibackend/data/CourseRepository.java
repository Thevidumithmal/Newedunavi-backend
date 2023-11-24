/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.newEdunavibackend.data;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
@Transactional
public interface CourseRepository  extends JpaRepository <Course, Integer> {
    
    @Query("select c from Course c where c.courseName=?1")
    List<Course> findCourseByCourseName(String name);
    
}
