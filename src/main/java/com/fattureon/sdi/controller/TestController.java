package com.fattureon.sdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fattureon.sdi.client.trasmissione.RiceviFileClient;

@RestController
public class TestController {
	
	@Autowired RiceviFileClient client;
	
	@RequestMapping("test")
	public void test1() {
		System.out.println("Sono dentro al bean test1");
		this.client.riceviFile("test");		 	
	}

}
