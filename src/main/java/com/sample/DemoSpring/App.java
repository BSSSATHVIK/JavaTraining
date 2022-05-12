package com.sample.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// IOC container (job creates & maintains the object of the spring)
     ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
     Student s=(Student)context.getBean("studentBean");
     System.out.println(s);
     
     
    }
}
