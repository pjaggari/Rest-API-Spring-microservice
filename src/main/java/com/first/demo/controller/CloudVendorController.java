package com.first.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.demo.model.CloudVendor;
import com.first.demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorController {


    CloudVendorService cvs;
    public CloudVendorController(CloudVendorService cvs) {
        this.cvs = cvs;
    }

    //Read specific cloud vendor details from db
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorID") String vendorId){
        return cvs.getCloudVendor(vendorId);
    }

    //Read all cloud vendor details from db
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){

        return cvs.getAllCloudVendors();
    }

    //Create a new vendor details in db
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cv)
    {
        cvs.createCloudVendor(cv);
        return "Cloud Vendor Created Successfully";
    }

    //Update a vendor details in db
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cv)
    {
        cvs.updateCloudVendor(cv);
        return "Cloud Vendor Updated Successfully";
    }

    //Delete a specific vendor details from db
    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(@PathVariable("vendorID") String vendorId)
    {
        cvs.deleteCloudVendor(vendorId);
        return "Cloud vendor Deleted Successfully";
    }

}
