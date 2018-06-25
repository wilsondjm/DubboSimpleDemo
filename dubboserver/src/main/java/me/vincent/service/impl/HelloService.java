package me.vincent.service.impl;

import me.vincent.service.GreetingsService;

public class HelloService implements GreetingsService {

	@Override
	public String say(String name) {
		return "Hello " + name + " !";
	}

}
