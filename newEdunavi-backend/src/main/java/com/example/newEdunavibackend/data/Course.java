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
    
    private String instituteName;
    private String courseName;
    private String courseImage;
    private String awardedUni;
    private String awardedUniImage;
    private String worldRanking;
    private String relatedIndustry;
    private String programmeType;
    private String programmeTime;
    private String programme;
    private String entryRequirement;
    private String courseStructure;
    private String fees;
    private String commencement;
    private int insId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public String getAwardedUni() {
        return awardedUni;
    }

    public void setAwardedUni(String awardedUni) {
        this.awardedUni = awardedUni;
    }

    public String getAwardedUniImage() {
        return awardedUniImage;
    }

    public void setAwardedUniImage(String awardedUniImage) {
        this.awardedUniImage = awardedUniImage;
    }

    public String getWorldRanking() {
        return worldRanking;
    }

    public void setWorldRanking(String worldRanking) {
        this.worldRanking = worldRanking;
    }

    public String getRelatedIndustry() {
        return relatedIndustry;
    }

    public void setRelatedIndustry(String relatedIndustry) {
        this.relatedIndustry = relatedIndustry;
    }

    public String getProgrammeType() {
        return programmeType;
    }

    public void setProgrammeType(String programmeType) {
        this.programmeType = programmeType;
    }

    public String getProgrammeTime() {
        return programmeTime;
    }

    public void setProgrammeTime(String programmeTime) {
        this.programmeTime = programmeTime;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getEntryRequirement() {
        return entryRequirement;
    }

    public void setEntryRequirement(String entryRequirement) {
        this.entryRequirement = entryRequirement;
    }

    public String getCourseStructure() {
        return courseStructure;
    }

    public void setCourseStructure(String courseStructure) {
        this.courseStructure = courseStructure;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getCommencement() {
        return commencement;
    }

    public void setCommencement(String commencement) {
        this.commencement = commencement;
    }

    public int getInsId() {
        return insId;
    }

    public void setInsId(int insId) {
        this.insId = insId;
    }

    
}
