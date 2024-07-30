package com.example.EBanking.entity;

import java.util.List;

import com.example.EBanking.model.CardModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CardTable")
public class CardEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cardID;
	private String cardType;
	private int cardNumber;
//	@ManyToOne 
	
	//@OneToMany(mappedBy = "CustomerID")
	//private CustomerEntity cuEntity;
	
	
	//@ManyToOne
//	private CustomerEntity cuEntity;
	
	
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
	
	
	/* ctrl+shift+/
	 * //public CustomerEntity getCuEntity() { return cuEntity; } public void
	 * setCuEntity(CustomerEntity cuEntity) { this.cuEntity = cuEntity; }
	 */
	
	@Override
	public String toString() {
		return "CardEntity [cardID=" + cardID + ", cardType=" + cardType + ", cardNumber=" + cardNumber + "]";
	}
	public CardModel convertToModel()
	{
	CardModel CModel = new CardModel();
	CModel.setCardID(cardID);
	CModel.setCardType(cardType);
	CModel.setCardNumber(cardNumber);
	return CModel;
	}
	
}
