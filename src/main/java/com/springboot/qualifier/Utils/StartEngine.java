package com.springboot.qualifier.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springboot.qualifier.service.Engine;
@Component
public class StartEngine {
	@Autowired
	@Qualifier(value="petrolEngine")
	private Engine engine;
	
	public void startEngine() {
		engine.start();
	}

}
