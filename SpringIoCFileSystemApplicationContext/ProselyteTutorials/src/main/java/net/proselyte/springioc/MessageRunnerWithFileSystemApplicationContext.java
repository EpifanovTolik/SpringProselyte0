package net.proselyte.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageRunnerWithFileSystemApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/resources/message-bean.xml");
        Message message = (Message) context.getBean("fromBeanMessage");
        System.out.println(message.getMessage());
    }
}
