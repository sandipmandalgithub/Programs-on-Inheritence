package com.JSpider;

public class Card {
	long cardNumber;
	int cvv;
	int balance;
	String name,expDate;
	
	void swip() {
		System.out.println("Swip the card");
	}

}
class creditCard extends Card{
	int creditLimit;
	void payBill() {
		System.out.println("pay credit card bill");
	}
	
}
class debitCard extends Card{
	double balance;
}
