package com.vivekspring.Spring_Jpa.service;


import java.util.List;

import com.vivekspring.Spring_Jpa.model.CloudVendorAPI;

public interface CloudVendorAPIService {
	
	public  String createCloudVendor(CloudVendorAPI cloudVendorAPI);
	public  String updateCloudVendor(CloudVendorAPI cloudVendorAPI);
	public  String deleteCloudVendor(String vendorId);
	public CloudVendorAPI getCloudVendor(String vendorId);
	public List<CloudVendorAPI> getAllCloudVendors();//This method will pull list of all the vendors in DBS

}
