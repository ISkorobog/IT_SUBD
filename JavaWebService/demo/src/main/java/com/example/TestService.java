package com.example;


import javax.xml.ws.Endpoint;

public class TestService {	
	
	public static void main(String[] args){
		Endpoint.publish("http://localhost:45000/q", new serviceimpl());
	}
	
}