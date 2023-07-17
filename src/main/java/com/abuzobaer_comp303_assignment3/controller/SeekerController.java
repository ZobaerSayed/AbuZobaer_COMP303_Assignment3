//package com.abuzobaer_comp303_assignment3.controller;
//
//import com.abuzobaer_comp303_assignment3.entity.BloodStock;
//import com.abuzobaer_comp303_assignment3.entity.Seeker;
//import com.abuzobaer_comp303_assignment3.service.SeekerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("seeker")
//public class SeekerController {
//
//    @Autowired
//    private SeekerService seekerService;
//
//    @GetMapping
//    public ResponseEntity<List<Seeker>> getAll()
//    {
//        return new ResponseEntity<>(seekerService.getAll(), HttpStatus.OK);
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<Seeker> findById(@PathVariable int id)
//    {
//        return new ResponseEntity<>(seekerService.findById(id),HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<Seeker> create(@RequestBody Seeker seeker)
//    {
//        return new ResponseEntity<>(seekerService.save(seeker),HttpStatus.OK);
//    }
//
//    @PutMapping
//    public ResponseEntity<Seeker> update(@RequestBody Seeker seeker)
//    {
//        return new ResponseEntity<>(seekerService.save(seeker),HttpStatus.OK);
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<String> delete(@PathVariable int id)
//    {
//        seekerService.delete(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
