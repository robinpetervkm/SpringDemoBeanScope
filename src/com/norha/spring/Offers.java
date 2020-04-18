package com.norha.spring;

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
	
}
