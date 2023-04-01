//package com.abuzobaer_comp303_assignment3.service;
//
//
//import com.abuzobaer_comp303_assignment3.dao.SeekerRepository;
//import com.abuzobaer_comp303_assignment3.entity.Seeker;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//
//
//@Service
//public class DbInit implements CommandLineRunner {
//
//
//
//    @Autowired
//    private SeekerRepository seekerRepository;
//
//
//    public DbInit(){
//
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        seekerRepository.deleteAll();
//        Seeker seeker=new Seeker();
//        seeker.setFirstName("test ");
//        seeker.setLastName("test");
//        seeker.setBloodGroup("A");
//        seeker.setPhone("12345678");
//        seeker.setGender("male");
//        seeker.setCity("toronto");
//        seekerRepository.save(seeker);
//
//        }
//
//}
