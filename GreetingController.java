package com.Nardos.Restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
	@Autowired
	@Qualifier("morning times")
	GreetingService greetingService;
	@Autowired
	FareWellService fareWellService;

	@GetMapping("/greet")
	public String getGreetings() {
		return greetingService.getGreetings();
	}

	@GetMapping("/farewell")
	public String getFareWellMessage() {
		return fareWellService.getFareWellMessage();
	}
}
