package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ap = new ClassPathXmlApplicationContext("confi.xml");
         AgentDao Dao=(AgentDao)ap.getBean("e");
         
        
        System.out.println(Dao.saveAgent(new Agent(1,"Divesh",000))); 
         
        System.out.println(Dao.saveAgent(new Agent(2,"suraj",74000))); 
        
        System.out.println(Dao.saveAgent(new Agent(3,"prajwal",84000))); 
         
        // Update Method
        System.out.println(Dao.updateAgent(new Agent(1,"mahesh",65000)));
         
       // Delete Method
      
     
        
    }
}
