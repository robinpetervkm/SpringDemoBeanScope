package com.norha.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Offers {
	private String offer = new String("No Current Offers");

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}
	@PostConstruct
	public void initMe() {
		System.out.println("Init Me Method called");
	}
	@PreDestroy
	public void doSomeThingBeforeDestroy() {
		System.out.println("Do Some Thing Before Destroy");
	}
}
