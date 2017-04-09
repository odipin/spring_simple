package com.dipinlearn.repository;

import java.util.List;

import com.dipinlearn.model.Customer;

public interface CustomerDao {

	List<Customer> findAll();

}