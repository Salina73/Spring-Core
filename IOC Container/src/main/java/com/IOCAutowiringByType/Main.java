package com.IOCAutowiringByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main(String args[])
    {

    	ApplicationContext bf = new ClassPathXmlApplicationContext("SpringConfig2.xml");
      
        Bean1 bean1 = (Bean1)bf.getBean("b1");
       
        bean1.show();
    }
}