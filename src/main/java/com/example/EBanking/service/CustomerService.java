package com.example.EBanking.service;

import java.util.List;

import com.example.EBanking.model.CustomerModel;

public interface CustomerService {

	public CustomerModel save(CustomerModel customerModel);

	public List<CustomerModel> getAll();

	public CustomerModel findById(int id);

	public CustomerModel updateData(CustomerModel customerModel);
	
	public void deleteById(int id);
	
}


