package com.hexaware.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hexaware.sprinannotations.beans.Employee;

import org.springframework.context.annotation.ComponentScan;


@Configuration //class level used by spring container as source of bean definition
// @ComponentScan(basePackages="com.hexaware.springannotations.*") for entity class
//@Service class level for class having business logic
//@Repository class-level DAOs
//@Controller class-level,specialization of component , mark as web request handler , serve web pages
//@Bean for creating objects
//Autowire for  auto wiring or auto DI

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=  new AnnotationConfigApplicationContext(App.class);
        Employee emp=context.getBean(Employee.class);
        System.out.println(emp);
    }
}
