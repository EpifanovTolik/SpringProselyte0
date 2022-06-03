package net.proselyte.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowiring-constructor-config.xml");

        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }
}
