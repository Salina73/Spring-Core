package com.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String args[])
    {
        ApplicationContext bf = new ClassPathXmlApplicationContext("BeanScope.xml");
          
        Book book1 = (Book)bf.getBean("book");
        Book book2 = (Book)bf.getBean("book");
        
        book1.setTitle("Jannat");
        book1.setAuthor("Salina");
    
        book1.getBookDetails("book1");   
        System.out.println();
        book2.getBookDetails("book2");
    }
}