package com.first.demo.service;

import java.util.List;

import com.first.demo.model.CloudVendor;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cv);
    public String updateCloudVendor(CloudVendor cv);
    public String deleteCloudVendor(String cv_id);
    public CloudVendor getCloudVendor(String cv_id);
    public List<CloudVendor> getAllCloudVendors();



}
