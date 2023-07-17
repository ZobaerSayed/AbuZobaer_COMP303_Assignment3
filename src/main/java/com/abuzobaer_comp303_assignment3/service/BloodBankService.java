//package com.abuzobaer_comp303_assignment3.service;
//
//import com.abuzobaer_comp303_assignment3.dao.BloodBankRepository;
//import com.abuzobaer_comp303_assignment3.entity.BloodBank;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BloodBankService {
//
//    @Autowired
//    private BloodBankRepository bloodBankRepository;
//
//    public List<BloodBank> getAll()
//    {
//        return bloodBankRepository.findAll();
//    }
//
//    public BloodBank findByName(String name)
//    {
//        return bloodBankRepository.findByBloodBankName(name);
//    }
//
//    public BloodBank save(BloodBank bloodBank)
//    {
//        return bloodBankRepository.save(bloodBank);
//    }
//
//    public void delete(int id)
//    {
//        bloodBankRepository.deleteById(id);
//    }
//    public BloodBank findById(int id)
//    {
//        return bloodBankRepository.findById(id).get();
//    }
//
//}
