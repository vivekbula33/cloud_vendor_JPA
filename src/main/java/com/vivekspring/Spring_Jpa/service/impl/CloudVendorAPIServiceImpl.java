package com.vivekspring.Spring_Jpa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vivekspring.Spring_Jpa.model.CloudVendorAPI;
import com.vivekspring.Spring_Jpa.repository.CloudVendorRepository;
import com.vivekspring.Spring_Jpa.service.CloudVendorAPIService;

@Service
public class CloudVendorAPIServiceImpl implements CloudVendorAPIService{
	
	//Before providing the logics to the methods we need to get the instance of Repository layer here
	//Because Repository layer is the layer which is actually talking to the database
	
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorAPIServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendorAPI cloudVendorAPI) {
		//More Business Logic
		cloudVendorRepository.save(cloudVendorAPI);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendorAPI cloudVendorAPI) {
		//More Business Logic
		cloudVendorRepository.save(cloudVendorAPI);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		//More Business Logic
		cloudVendorRepository.deleteById(vendorId);
		return "Success";
	}

	@Override
	public CloudVendorAPI getCloudVendor(String vendorId) {
		//More Business Logic
		
		return cloudVendorRepository.findById(vendorId).get();
	}

	@Override
	public List<CloudVendorAPI> getAllCloudVendors() {
		//More Business Logic
		
		return cloudVendorRepository.findAll();
	}

}
