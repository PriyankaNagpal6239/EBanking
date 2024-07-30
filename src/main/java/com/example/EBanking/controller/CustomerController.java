package com.example.EBanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.EBanking.model.CustomerModel;
import com.example.EBanking.service.CustomerService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	

	@PostMapping("/")
	public CustomerModel addData(@RequestBody CustomerModel customerModel) {	
		return this.customerService.save(customerModel);
	}
	
	@GetMapping("/")
	public List<CustomerModel> getdata() {
		return this.customerService.getAll();
	}
	
	@GetMapping("/id")
	public CustomerModel getRecord(@PathVariable("id") int id) {
	return this.customerService.findById(id);
}
	
@PutMapping("/")
	public CustomerModel updateRecord(@RequestBody CustomerModel customerModel) {
		return this.customerService.save(customerModel);
	}

	@DeleteMapping("/id")
	public String deleteRecord(@PathVariable("id") int id) {
	this.customerService.deleteById(id);
		return "record deleted";
}
	
}
