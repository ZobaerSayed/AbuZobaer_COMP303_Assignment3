package com.abuzobaer_comp303_assignment3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
public class Seeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "First Name cannot be empty.")
    private String firstName;
    @NotEmpty(message = "Last Name cannot be empty.")
    private String lastName;
    @NotEmpty(message = "Gender cannot be empty.")
    private String gender;
    @NotEmpty(message = "Blood Group cannot be empty.")
    private String bloodGroup;
    @NotEmpty(message = "City cannot be empty.")
    private String city;
    @NotEmpty(message = "Phone cannot be empty.")
    private String phone;

}
