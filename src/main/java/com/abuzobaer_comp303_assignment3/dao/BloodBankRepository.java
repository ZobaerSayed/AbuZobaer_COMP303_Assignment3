package com.abuzobaer_comp303_assignment3.dao;

import com.abuzobaer_comp303_assignment3.entity.BloodBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodBankRepository extends JpaRepository<BloodBank,Integer> {

    BloodBank findByBloodBankName(String name);
}
