//package com.abuzobaer_comp303_assignment3.service;
//
//import com.abuzobaer_comp303_assignment3.dao.SeekerRepository;
//import com.abuzobaer_comp303_assignment3.entity.Seeker;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class SeekerService {
//
//    @Autowired
//    private SeekerRepository seekerRepository;
//
//    public List<Seeker> getAll()
//    {
//        return seekerRepository.findAll();
//    }
//    public Seeker save(Seeker seeker)
//    {
//        return seekerRepository.save(seeker);
//    }
//
//    public Seeker findById(int id)
//    {
//        return seekerRepository.findById(id).get();
//    }
//    public void delete(int id)
//    {
//        seekerRepository.deleteById(id);
//    }
//}
