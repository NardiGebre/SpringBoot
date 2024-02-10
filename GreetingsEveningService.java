package com.Nardos.Restaurant;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("eveningMessage")
@Profile("dev")

public class GreetingsEveningService implements GreetingsInterface {
	public String getGreetings() {
		return "Greetings from evening times";
	}
}
