package com.abuzobaer_comp303_assignment3.controller;

import com.abuzobaer_comp303_assignment3.entity.BloodBank;
import com.abuzobaer_comp303_assignment3.entity.BloodStock;
import com.abuzobaer_comp303_assignment3.service.BloodStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bloodStock")
public class BloodStockController {

    @Autowired
    private BloodStockService bloodStockService;

    @GetMapping
    public ResponseEntity<List<BloodStock>> getAll()
    {
        return new ResponseEntity<>(bloodStockService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<BloodStock> findById(@PathVariable int id)
    {
        return new ResponseEntity<>(bloodStockService.findById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BloodStock> create(@RequestBody BloodStock bloodStock)
    {
        return new ResponseEntity<>(bloodStockService.save(bloodStock),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<BloodStock> update(@RequestBody BloodStock bloodStock)
    {
        return new ResponseEntity<>(bloodStockService.save(bloodStock),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable int id)
    {
        bloodStockService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
