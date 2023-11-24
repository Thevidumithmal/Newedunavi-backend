/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.service;

import com.example.newEdunavibackend.data.Institute;
import com.example.newEdunavibackend.data.InstituteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class InstituteService {

    @Autowired
    private InstituteRepository instituteRepository;

    //get all values in Institute table-------------------------------------------
    public List<Institute> getAllInstitute() {
        List<Institute> institute = instituteRepository.findAll();
        return institute;
    }

    //add institute part---------------------------------------------------------
    public Institute addInstitute(Institute institute) {
        return instituteRepository.save(institute);
    }

    //update part ---------------
    public Institute updateInstitute(Institute ird) {
        return instituteRepository.save(ird);
    }

    //delete by id --------------------
    public void deleteInstituteById(int id) {
        instituteRepository.deleteById(id);
    }

    //get  values in Institute table using id-----
    public Institute getInstituteById(int id) {
        Optional<Institute> ird = instituteRepository.findById(id);
        return ird.get();
    }

    //get values from institute table using institute name-------------------------
    public List<Institute> findInstituteByInstituteName(String name) {
        return instituteRepository.findInstituteByInstituteName(name);
    }
    
     //get values from institute table using institute regno-------------------------
    public List<Institute> findInstituteByInstituteRegNo(String no) {
        return instituteRepository.findInstituteByInstituteRegNo(no);
    }

}
