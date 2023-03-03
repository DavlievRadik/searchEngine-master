package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext("main");
        SpringApplication.run(Main.class, args);
    }

}
