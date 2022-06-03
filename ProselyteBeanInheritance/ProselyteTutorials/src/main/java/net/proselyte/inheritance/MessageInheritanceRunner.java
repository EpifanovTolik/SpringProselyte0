package net.proselyte.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageInheritanceRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inheritance-message-config.xml");

        Message message = (Message) context.getBean("message");

        System.out.println("First Bean:");
        System.out.println(message.getMessage());

        System.out.println("=====================================");
        MessageToYou messageToYou = (MessageToYou) context.getBean("messageToYou");
        System.out.println("Second Bean:");
        System.out.println(messageToYou.getMessage());
        System.out.println(messageToYou.getMessageToYou());
    }
}
