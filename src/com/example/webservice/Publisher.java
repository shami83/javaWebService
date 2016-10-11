package com.example.webservice;

import javax.xml.ws.Endpoint;

public class Publisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8001/ws/adder", new AdderImpl()); 
		System.out.println("success" + Endpoint.WSDL_SERVICE);
	}

}
