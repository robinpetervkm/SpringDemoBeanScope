package com.norha.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext("BeanScope.xml");
		
		Offers offers1 = context.getBean("offers",Offers.class);
		Offers offers2 = (Offers) context.getBean("offers");
		offers1.setOffer("10% offer this Month");
		System.out.println("offers1 : "+offers1.getOffer());
		System.out.println("offers2 : "+offers2.getOffer());
		
		System.out.println("Offer 1 : location := "+offers1);
		System.out.println("Offer 2 : location := "+offers2);
		
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