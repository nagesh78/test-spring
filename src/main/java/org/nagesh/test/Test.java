package org.nagesh.test;

import org.nagesh.spring.Context;
import org.springframework.context.ApplicationContext;

public class Test {

    private String message;

    public static void main (String[] args) {
        System.out.println("Test");

        ApplicationContext context = Context.getApplicationInstance();

        Test c = (Test) context.getBean("hello");

        System.out.println(c.getMessage());

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}