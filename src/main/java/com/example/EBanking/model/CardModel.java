package com.example.EBanking.model;

import java.util.List;

import com.example.EBanking.entity.CustomerEntity;

public class CardModel {

	private int cardID;
	private String cardType;
	private int cardNumber;
	public int getCardID() {
		return cardID;
	}
	public void setCardID(int cardID) {
		this.cardID = cardID;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
}
