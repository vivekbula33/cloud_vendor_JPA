package com.vivekspring.Spring_Jpa.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivekspring.Spring_Jpa.model.CloudVendorAPI;
import com.vivekspring.Spring_Jpa.service.CloudVendorAPIService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIController {
	
	/*We have to add instance of service layer because our controller is interacting with the service layer
	
	rom controller we are sending request to services layer and 
	we could see service layer communicating with repository layer*/
	
	CloudVendorAPIService cloudVendorAPIService;
	
	public CloudVendorAPIController(CloudVendorAPIService cloudVendorAPIService) {
		this.cloudVendorAPIService = cloudVendorAPIService;
	}

	//Read Specific vendor details
	@GetMapping("{vendorId}")/*For extracting vendor id from get mapping to as argument we need to use @PathVariable*/
	public CloudVendorAPI getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		
		return cloudVendorAPIService.getCloudVendor(vendorId);
		
		//return new CloudVendorAPI("C1","Vendor1","Address one","xxxxxxxx");
		
	}
	
	//Read all the vendor details
	@GetMapping()//For extracting vendor id from get mapping to as argument we need to use @PathVariable
	public List<CloudVendorAPI> getAllCloudVendorDetails()
	{
		
		return cloudVendorAPIService.getAllCloudVendors();
		
		//return new CloudVendorAPI("C1","Vendor1","Address one","xxxxxxxx");
		
	}

	@PostMapping
	public  String createCloudVendorDetails(@RequestBody CloudVendorAPI cloudVendorAPI) {
		
		cloudVendorAPIService.createCloudVendor(cloudVendorAPI);
		return "Cloud Vendor Create Successfully";
	}
	
	@PutMapping
    public  String updateCloudVendorDetails(@RequestBody CloudVendorAPI cloudVendorAPI) {
		
		cloudVendorAPIService.updateCloudVendor(cloudVendorAPI);
		return "Cloud Vendor updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
    public  String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		
		cloudVendorAPIService.deleteCloudVendor(vendorId);
		return "Cloud Vendor deleted Successfully";
	}
}

