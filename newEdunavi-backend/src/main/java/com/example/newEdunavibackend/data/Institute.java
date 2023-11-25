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
public class Institute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String insName;
    private String insImage;
    private String overview;
    private String startDate;
    private String location;
    private int insMobile;
    private String insEmail;
    private String insWebsite;
    private int recommendedBankNo;
    private String insRegisterNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getInsImage() {
        return insImage;
    }

    public void setInsImage(String insImage) {
        this.insImage = insImage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getInsMobile() {
        return insMobile;
    }

    public void setInsMobile(int insMobile) {
        this.insMobile = insMobile;
    }

    public String getInsEmail() {
        return insEmail;
    }

    public void setInsEmail(String insEmail) {
        this.insEmail = insEmail;
    }

    public String getInsWebsite() {
        return insWebsite;
    }

    public void setInsWebsite(String insWebsite) {
        this.insWebsite = insWebsite;
    }

    public int getRecommendedBankNo() {
        return recommendedBankNo;
    }

    public void setRecommendedBankNo(int recommendedBankNo) {
        this.recommendedBankNo = recommendedBankNo;
    }

    public String getInsRegisterNo() {
        return insRegisterNo;
    }

    public void setInsRegisterNo(String insRegisterNo) {
        this.insRegisterNo = insRegisterNo;
    }

}
