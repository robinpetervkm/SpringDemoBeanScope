package com.norha.spring;

public class Offers {
	private String offer = new String("No Current Offers");

	public String getOffer() {
		return offer;
	}
	public void start() {
		System.out.println("Sarted");
	}
	public void ends() {
		System.out.println("ended");
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}
	
}
