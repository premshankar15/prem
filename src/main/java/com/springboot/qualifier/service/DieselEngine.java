package com.springboot.qualifier.service;

import org.springframework.stereotype.Service;

@Service
public class DieselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Starting Diesel Engine");
		
	}

}
