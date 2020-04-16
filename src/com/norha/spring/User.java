package com.norha.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("BeanScope.xml");
		Offers offers = (Offers) context.getBean("offers");
		System.out.println(offers.getOffer());
		context.close();
	}
}
