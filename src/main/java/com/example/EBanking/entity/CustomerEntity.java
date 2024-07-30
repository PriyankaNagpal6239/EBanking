package com.example.EBanking.entity;

import java.util.List;

import com.example.EBanking.model.CustomerModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CustomerTable")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerID;
	private String customerName;
	
	@OneToMany //(mappedBy = "CustomerID")
	private List<CardEntity> cEntity;

	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	public List<CardEntity> getcEntity() {
		return cEntity;
	}
	public void setcEntity(List<CardEntity> cEntity) {
		this.cEntity = cEntity;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customerID=" + customerID + ", customerName=" + customerName + ", cEntity=" + cEntity
				+ "]";
	}
	public CustomerModel convertToModel() {
		CustomerModel CuModel = new CustomerModel();
		CuModel.setCustomerID(customerID);
		CuModel.setCustomerName(customerName);
		//CuModel.setcEntity(cEntity);
		return CuModel;
	
	}
		
}
