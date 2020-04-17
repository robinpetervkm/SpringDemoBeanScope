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

/********************************************
Setps
*****


1 Instantiation
2 Populate Properties
3 Sets the Bean Name
4 Sets Bean Factory
5 Pre-initiazation (Sets Property)
6 Initializing Bean
7 Call custom init-method
8 Post-Intializing Bean
9 Bean Ready for use

Steps

1 Destroy Bean
2 call Custom Destroy Method

*****************************************/