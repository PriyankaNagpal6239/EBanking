package com.example.EBanking.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EBanking.entity.CardEntity;
import com.example.EBanking.model.CardModel;
import com.example.EBanking.repo.CardRepo;
import com.example.EBanking.service.CardService;

@Service
public class CardServiceImpl implements CardService {


	@Autowired
	CardRepo cardRepo;
	
	@Override
	public CardModel save(CardModel cardModel) {
		// TODO Auto-generated method stub
		        CardEntity entity = convertToEntity(cardModel);
		        CardEntity savedEntity = cardRepo.save(entity);
		        return convertToModel(savedEntity);
		    }

	@Override
	public List<CardModel> getAll() {
		// TODO Auto-generated method stub
		 List<CardEntity> entities = cardRepo.findAll();
		    
		    // Convert each CardEntity to CardModel and collect into a List
		    return entities.stream()
		            .map(this::convertToModel)
		            .collect(Collectors.toList());
	        
	}

	@Override
	public CardModel findById(int id) {
		// TODO Auto-generated method stub
		 CardEntity entity = cardRepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Card not found with id: " + id));
	        return convertToModel(entity);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 cardRepo.deleteById(id);
	}

	@Override
	public CardModel updateData(CardModel cardModel) {
		// TODO Auto-generated method stub
		  CardEntity entity = convertToEntity(cardModel);
	        CardEntity updatedEntity = cardRepo.save(entity);
	        return convertToModel(updatedEntity);
	}

	private CardEntity convertToEntity(CardModel cardModel) {
		// TODO Auto-generated method stub
		CardEntity Centity = new CardEntity();
		Centity.setCardID(cardModel.getCardID());
        Centity.setCardType(cardModel.getCardType());
        Centity.setCardNumber(cardModel.getCardNumber());
        // Set other fields as needed
        return Centity;
	}
	private CardModel convertToModel(CardEntity savedEntity) {
		// TODO Auto-generated method stub
		CardModel Cmodel = new CardModel();
        Cmodel.setCardID(savedEntity.getCardID());
        Cmodel.setCardType(savedEntity.getCardType());
        Cmodel.setCardNumber(savedEntity.getCardNumber());
        // Set other fields as needed
        return Cmodel;
	}
	
	
}
