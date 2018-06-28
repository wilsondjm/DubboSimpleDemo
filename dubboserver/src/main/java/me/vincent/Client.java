package me.vincent;

import me.vincent.service.GreetingsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vincent on 2018/6/28.
 */
public class Client {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo_client.xml"});
        context.start();
        GreetingsService greeting = (GreetingsService) context.getBean("helloService");

        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println(greeting.say("Vincent"));
        System.out.println("\n\n\n\n\n\n\n\n\n");
    }
}
