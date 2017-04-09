package com.dipinlearn.service;

import java.util.List;

import com.dipinlearn.model.Customer;
import com.dipinlearn.repository.CustomerDao;
import com.dipinlearn.repository.HibernateCustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao = new HibernateCustomerDaoImpl();
	
	public List<Customer> findAll(){
		return customerDao.findAll();
	}

}
