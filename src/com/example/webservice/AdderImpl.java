package com.example.webservice;
import javax.jws.WebService;

@WebService(endpointInterface = "com.example.webservice.Adder")
public class AdderImpl implements Adder{

	
	public int add(int a, int b) {
		System.out.println("Return result " + (a+b));
		return a+b;
		
		
		
	}

}
