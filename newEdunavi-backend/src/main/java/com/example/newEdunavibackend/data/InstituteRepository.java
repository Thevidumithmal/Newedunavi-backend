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
public interface InstituteRepository extends JpaRepository<Institute, Integer> {

    @Query("select i from Institute i where i.insName=?1")
    List<Institute> findInstituteByInstituteName(String name);
    
    @Query("select i from Institute i where i.insRegisterNo=?1")
    List<Institute> findInstituteByInstituteRegNo(String no);
}
