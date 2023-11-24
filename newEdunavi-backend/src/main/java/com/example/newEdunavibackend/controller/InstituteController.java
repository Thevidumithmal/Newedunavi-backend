/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.controller;

import com.example.newEdunavibackend.data.Institute;
import com.example.newEdunavibackend.service.InstituteService;
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
public class InstituteController {

    @Autowired
    private InstituteService instituteService;

    //get all values from Institute table-----------------------------------------
    @GetMapping(path = "/institutes")
    public List<Institute> getAllInstitute() {
        return instituteService.getAllInstitute();
    }

    //get value using institute id----------------------------------------------
    @GetMapping(path = "/institutes/{id}")
    public Institute getInstituteById(@PathVariable int id) {

        return instituteService.getInstituteById(id);
    }

    //create institute part-------------------------------------------------------
    @PostMapping(path = "/institutes")
    public Institute addInstitute(@RequestBody Institute institute) {
        return instituteService.addInstitute(institute);
    }

    //update institute part----------------------------------------------------
    @PutMapping(path = "/institutes")
    public Institute updateInstitute(@RequestBody Institute ird) {

        return instituteService.updateInstitute(ird);
    }

    //delete using  id------------------------------------------------
    @DeleteMapping(path = "/institutes/{id}")
    public void deleteInstituteById(@PathVariable int id) {

        instituteService.deleteInstituteById(id);
    }

    //get value from institute table using institute name---------------------------
    @GetMapping(path = "/institutes", params = "name")
    public List<Institute> findInstituteByInstituteName(@RequestParam String name) {
        return instituteService.findInstituteByInstituteName(name);
    }

    //get value from institute table using institute regno ---------------------------
    @GetMapping(path = "/institutes", params = "no")
    public List<Institute> findInstituteByInstituteRegNo(@RequestParam String no) {
        return instituteService.findInstituteByInstituteRegNo(no);
    }

}
