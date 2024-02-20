package com.JSpider;
//INHERITANCE IN JAVA
public class Test {

	public static void main(String[] args) {
		creditCard cc=new creditCard();
		cc.cardNumber=12365497823l;
		cc.cvv=123;
		cc.balance=20000;
		System.out.println(cc.balance);
		cc.name="sandip mandal";
		cc.expDate="03/25";
		cc.swip();
		cc.creditLimit=78945;
		cc.payBill();
		
		cc.balance=3000;
		
		
		System.out.println(cc.balance);

	}

}
