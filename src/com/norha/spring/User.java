package com.norha.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("BeanScope.xml");
		Offers offers = (Offers) context.getBean("offers");
		System.out.println("offers : "+offers.getOffer());
		offers.setOffer("GET 10% Discount");
		System.out.println("offers : "+offers.getOffer());
		
		Offers offers1 = (Offers) context.getBean("offers");
		System.out.println("offers1 : "+offers1.getOffer());
		
		
		
		System.out.println(offers);
		
		System.out.println(offers1);
		context.close();
	}
}
