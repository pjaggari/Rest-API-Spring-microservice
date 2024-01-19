package com.first.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.demo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{


}
