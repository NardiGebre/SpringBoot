package com.Nardos.Restaurant;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("morning times")
@Profile("dev")

public class GreetingService implements GreetingsInterface {
	public String getGreetings() {
		return "Greetings from service in the morning times";
	}
}
