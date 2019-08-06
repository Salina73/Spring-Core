package com.BeanLifeCycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String args[])
    {
        AbstractApplicationContext applicationContext =  new ClassPathXmlApplicationContext("BeanLifeCycle.xml");

        BeanLifeCycle id =  (BeanLifeCycle) applicationContext.getBean("initdest");

        id.display();

        applicationContext.close();
    }
}