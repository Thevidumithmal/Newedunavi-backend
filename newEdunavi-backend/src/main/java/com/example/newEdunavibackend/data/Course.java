/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;
    private String image;
    private String awardedUni;
    private String duration;
    private String overallIdea;
    private String programmeType;
    private String entryRequirement;
    private String category;
    private String commencement;
    private String educationalRequirement;
    private String courseModule;
    private String fees;
    private String ugcRecognize;
    private String date;
    private String industry;
    private int insId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

  

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAwardedUni() {
        return awardedUni;
    }

    public void setAwardedUni(String awardedUni) {
        this.awardedUni = awardedUni;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getOverallIdea() {
        return overallIdea;
    }

    public void setOverallIdea(String overallIdea) {
        this.overallIdea = overallIdea;
    }

    public String getProgrammeType() {
        return programmeType;
    }

    public void setProgrammeType(String programmeType) {
        this.programmeType = programmeType;
    }

    public String getEntryRequirement() {
        return entryRequirement;
    }

    public void setEntryRequirement(String entryRequirement) {
        this.entryRequirement = entryRequirement;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCommencement() {
        return commencement;
    }

    public void setCommencement(String commencement) {
        this.commencement = commencement;
    }

    public String getEducationalRequirement() {
        return educationalRequirement;
    }

    public void setEducationalRequirement(String educationalRequirement) {
        this.educationalRequirement = educationalRequirement;
    }

    public String getCourseModule() {
        return courseModule;
    }

    public void setCourseModule(String courseModule) {
        this.courseModule = courseModule;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getUgcRecognize() {
        return ugcRecognize;
    }

    public void setUgcRecognize(String ugcRecognize) {
        this.ugcRecognize = ugcRecognize;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getInsId() {
        return insId;
    }

    public void setInsId(int insId) {
        this.insId = insId;
    }
    
    
    
    
    

}
