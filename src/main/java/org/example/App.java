package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        String[] beanNames = SpringApplication.run(App.class, args).getBeanDefinitionNames();
        int counter = 0;
        for ( String beanName : beanNames) {
            Thread.sleep(200);
            System.out.println( ++counter + " - " + beanName );
        }
    }
}