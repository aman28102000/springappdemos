package com.samples.S01springcoredi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
       
       Employee emp = (Employee) springContainer.getBean("emp"); 
       System.out.println(emp);
       
      Hospital hospital = (Hospital) springContainer.getBean("hospital"); 
       System.out.println(hospital);
       
       Customer customer = (Customer) springContainer.getBean("customer");
       System.out.println(customer);
    }
}