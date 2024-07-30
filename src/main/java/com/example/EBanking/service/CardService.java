package com.example.EBanking.service;


import java.util.List;

import com.example.EBanking.model.CardModel;

public interface CardService {

	public CardModel save(CardModel cardModel);

	public List<CardModel> getAll();

	public CardModel findById(int id) ;

	public void deleteById(int id);
	
	public CardModel updateData(CardModel cardModel);

	
}
