/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.service;

import com.example.newEdunavibackend.data.Bank;
import com.example.newEdunavibackend.data.BankRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    //get all details from bank table------------------
    public List<Bank> getAllBank() {
        List<Bank> banks = bankRepository.findAll();
        return banks;

    }

    // create bank part------
    public Bank createBank(Bank brd) {
        return bankRepository.save(brd);
    }

    // update bank details--------
    public Bank updateBank(Bank brd) {
        return bankRepository.save(brd);
    }

    // delete bank details------
    public void deleteBankById(int id) {
        bankRepository.deleteById(id);
    }

    // get bank details by id-------------
    public Bank getBankById(int id) {
        Optional<Bank> brd = bankRepository.findById(id);
        return brd.get();

    }
    
    //get values from bank table using bank name-------------------------
    public List<Bank> findBankByBankName(String name) {
        return bankRepository.findBankByBankName(name);
    }

}
