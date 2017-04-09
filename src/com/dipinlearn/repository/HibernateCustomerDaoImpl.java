package com.dipinlearn.repository;

import java.util.ArrayList;
import java.util.List;

import com.dipinlearn.model.Customer;

public class HibernateCustomerDaoImpl implements CustomerDao {

	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Dipin");
		customer.setLastname("Ojha");
		
		customers.add(customer);
		return customers;
		
	}
}
