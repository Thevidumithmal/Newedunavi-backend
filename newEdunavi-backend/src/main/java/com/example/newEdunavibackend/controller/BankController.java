/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.controller;

import com.example.newEdunavibackend.data.Bank;
import com.example.newEdunavibackend.service.BankService;
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
public class BankController {

    @Autowired
    private BankService bankService;

    //Get all details from bank table---------------------
    @GetMapping(path = "/banks")
    public List<Bank> getAllBanks() {

        return bankService.getAllBank();
    }

    //get value using bank id----------------------------------------------
    @GetMapping(path = "/banks/{id}")
    public Bank getBankById(@PathVariable int id) {

        return bankService.getBankById(id);
    }

    // create bank part----------
    @PostMapping(path = "/banks")
    public Bank createBank(@RequestBody Bank brd) {
        return bankService.createBank(brd);
    }

    // update bank details--------
    @PutMapping(path = "/banks")
    public Bank updateBank(@RequestBody Bank brd) {
        return bankService.updateBank(brd);
    }

    // delete bank using id------
    @DeleteMapping(path = "/banks/{id}")
    public void deleteBankById(@PathVariable int id) {
        bankService.deleteBankById(id);
    }

    //get value from bank table using bank name---------------------------
    @GetMapping(path = "/banks", params = "name")
    public List<Bank> findBankByBankName(@RequestParam String name) {
        return bankService.findBankByBankName(name);
    }

}
