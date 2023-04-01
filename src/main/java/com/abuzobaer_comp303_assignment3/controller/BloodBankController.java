package com.abuzobaer_comp303_assignment3.controller;

import com.abuzobaer_comp303_assignment3.entity.BloodBank;
import com.abuzobaer_comp303_assignment3.service.BloodBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bloodBank")
public class BloodBankController {

    @Autowired
    private BloodBankService bloodBankService;

    @GetMapping
    public ResponseEntity<List<BloodBank>> getAll()
    {
        return new ResponseEntity<>(bloodBankService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<BloodBank> findById(@PathVariable int id)
    {
        return new ResponseEntity<>(bloodBankService.findById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BloodBank> create(@RequestBody BloodBank bloodBank)
    {
     return new ResponseEntity<>(bloodBankService.save(bloodBank),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<BloodBank> update(@RequestBody BloodBank bloodBank)
    {
        return new ResponseEntity<>(bloodBankService.save(bloodBank),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable int id)
    {
        bloodBankService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
