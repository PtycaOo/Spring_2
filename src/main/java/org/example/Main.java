package org.example;


import org.example.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        String hello = context.getBean(String.class);
        System.out.println(hello);
    }
}