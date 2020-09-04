package com.springboot.qualifier.service;

import org.springframework.stereotype.Service;

@Service

public class PetrolEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Starting Petrol Engine.......");
		
	}

}
