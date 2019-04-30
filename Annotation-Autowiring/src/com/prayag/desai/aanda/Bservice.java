package com.prayag.desai.aanda;

import org.springframework.stereotype.Component;

@Component
public class Bservice implements FortuneService {

	@Override
	public String getFortune() {
		
		return "this is the B fortune";
	}

}
