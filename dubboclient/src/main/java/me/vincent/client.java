package me.vincent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.vincent.service.GreetingsService;

public class client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo.xml"});
		context.start();
		GreetingsService service = (GreetingsService) context.getBean("greetingsService");
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println(service.say("Vincent"));
		System.out.println("\n\n\n\n\n\n\n\n\n");
	}

}
