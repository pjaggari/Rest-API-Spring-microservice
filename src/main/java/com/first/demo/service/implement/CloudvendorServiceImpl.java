package com.first.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.first.demo.model.CloudVendor;
import com.first.demo.repository.CloudVendorRepository;
import com.first.demo.service.CloudVendorService;

@Service
public class CloudvendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cvr;
    

    public CloudvendorServiceImpl(CloudVendorRepository cvr) {
        this.cvr = cvr;
    }

    @Override
    public String createCloudVendor(CloudVendor cv) {
        
        cvr.save(cv);
        return "Successfully created";
        //throw new UnsupportedOperationException("Unimplemented method 'createCloudVendor'");
    }

    @Override
    public String updateCloudVendor(CloudVendor cv) {
        
        cvr.save(cv);
        return "Successfully updated";
        //throw new UnsupportedOperationException("Unimplemented method 'updateCloudVendor'");
    }

    @Override
    public String deleteCloudVendor(String cv_id) {

        cvr.deleteById(cv_id);
        return "Succesfully Deleted";
        //throw new UnsupportedOperationException("Unimplemented method 'deleteCloudVendor'");
    }

    @Override
    public CloudVendor getCloudVendor(String cv_id) {
        
        
        return cvr.findById(cv_id).get();
        //throw new UnsupportedOperationException("Unimplemented method 'getCloudVendor'");
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {


        return cvr.findAll();
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCloudVendors'");
    }

}
