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

import com.example.EBanking.model.CardModel;
import com.example.EBanking.service.CardService;
@RestController
@RequestMapping("/Card")
public class CardController {
	
	@Autowired
	CardService cardService;


	@PostMapping("/")
	public CardModel addData(@RequestBody CardModel cardModel) {
	//	CardEntity entity= this.cardService.save(cardModel);
		//return cardModel.convertToModel();	
		return this.cardService.save(cardModel);
	}
	
	@GetMapping("/")
	public List<CardModel> getdata() {
		return this.cardService.getAll();
	}
	
	@GetMapping("/id")
	public CardModel getRecord(@PathVariable("id") int id) {
	return this.cardService.findById(id);
}
	
@PutMapping("/")
	public CardModel updateRecord(@RequestBody CardModel cardModel) {
		return this.cardService.save(cardModel);
	}

	@DeleteMapping("/id")
	public String deleteRecord(@PathVariable("id") int id) {
	this.cardService.deleteById(id);
		return "record deleted";
}
}

