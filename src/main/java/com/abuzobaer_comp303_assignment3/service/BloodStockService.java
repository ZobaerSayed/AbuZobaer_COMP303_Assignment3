//package com.abuzobaer_comp303_assignment3.service;
//
//import com.abuzobaer_comp303_assignment3.dao.BloodStockRepository;
//import com.abuzobaer_comp303_assignment3.entity.BloodBank;
//import com.abuzobaer_comp303_assignment3.entity.BloodStock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BloodStockService {
//
//    @Autowired
//    private BloodStockRepository bloodStockRepository;
//
//    public List<BloodStock> getAll()
//    {
//        return bloodStockRepository.findAll();
//    }
//
//    public BloodStock save(BloodStock bloodStock)
//    {
//       return bloodStockRepository.save(bloodStock);
//    }
//    public BloodStock findById(int id)
//    {
//        return bloodStockRepository.findById(id).get();
//    }
//    public void delete(int id)
//    {
//        bloodStockRepository.deleteById(id);
//    }
//
//}
