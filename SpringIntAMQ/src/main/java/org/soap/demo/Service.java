package org.soap.demo;

import org.springframework.integration.annotation.ServiceActivator;

public class Service {

	@ServiceActivator
	public String add(Data input) throws Exception {
		return String.valueOf("Result:"
				+ (input.getNumber1() + input.getNumber2()));
	}

}