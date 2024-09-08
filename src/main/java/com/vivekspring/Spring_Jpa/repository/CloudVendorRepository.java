package com.vivekspring.Spring_Jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivekspring.Spring_Jpa.model.CloudVendorAPI;

//We have to use mpdel class name and the Id field data type 
//which we are using in the model class as arguments
public interface CloudVendorRepository extends JpaRepository<CloudVendorAPI, String>{

}
