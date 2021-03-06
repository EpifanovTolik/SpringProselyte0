package net.proselyte.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("annotations-jsr250-config.xml");

        Message message = (Message) context.getBean("message");
        System.out.println(message.getMessage());

        context.registerShutdownHook();
    }
}
