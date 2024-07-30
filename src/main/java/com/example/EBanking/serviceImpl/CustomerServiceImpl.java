package com.example.EBanking.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EBanking.entity.CardEntity;
import com.example.EBanking.entity.CustomerEntity;
import com.example.EBanking.model.CardModel;
import com.example.EBanking.model.CustomerModel;
import com.example.EBanking.repo.CustomerRepo;
import com.example.EBanking.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService  {

	@Autowired
	CustomerRepo customerRepo;
	
	public CustomerModel save(CustomerModel customerModel) {
		 CustomerEntity entity = convertToEntity(customerModel);
	        CustomerEntity savedEntity = customerRepo.save(entity);
	        return convertToModel(savedEntity);
	}

	private CustomerModel convertToModel(CustomerEntity savedEntity) {
		CustomerModel Cmodel = new CustomerModel();
        Cmodel.setCustomerID(savedEntity.getCustomerID());
        Cmodel.setCustomerName(savedEntity.getCustomerName());
        // Set other fields as needed
        return Cmodel;
	}

	private CustomerEntity convertToEntity(CustomerModel customerModel) {
		// TODO Auto-generated method stub
		CustomerEntity Centity = new CustomerEntity();
		Centity.setCustomerID(customerModel.getCustomerID());
        Centity.setCustomerName(customerModel.getCustomerName());
        
        List<CardModel> Cmodel= customerModel.getcModel();
        List<CardEntity> cEntity = new ArrayList<CardEntity>();
		for(CardModel model1:Cmodel){
			CardEntity entity=new CardEntity();
			entity.setCardID(model1.getCardID());
			cEntity.add(entity);
		}
		
		Centity.setcEntity(cEntity);
        // Set other fields as needed
        return Centity;
	}

	@Override
	public List<CustomerModel> getAll() {
		// TODO Auto-generated method stub
		 List<CustomerEntity> entities = customerRepo.findAll();
		    
		    // Convert each CardEntity to CardModel and collect into a List
		    return entities.stream()
		            .map(this::convertToModel)
		            .collect(Collectors.toList());
	}

	@Override
	public CustomerModel findById(int id) {
		// TODO Auto-generated method stub
		 CustomerEntity entity = customerRepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Card not found with id: " + id));
	        return convertToModel(entity);
	}

	@Override
	public CustomerModel updateData(CustomerModel customerModel) {
		// TODO Auto-generated method stub
	CustomerEntity CEntity = convertToEntity(customerModel) ;
	CustomerEntity updatedEntity = customerRepo.save(CEntity);
	return convertToModel(updatedEntity);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 customerRepo.deleteById(id);
	}
}
