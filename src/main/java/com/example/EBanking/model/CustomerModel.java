package com.example.EBanking.model;

import java.util.List;

import com.example.EBanking.entity.CardEntity;

public class CustomerModel {
	private int CustomerID;
	private String customerName;
	private List<CardModel> cModel;
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<CardModel> getcModel() {
		return cModel;
	}
	public void setcModel(List<CardModel> cModel) {
		this.cModel = cModel;
	}
	
	
	
}
