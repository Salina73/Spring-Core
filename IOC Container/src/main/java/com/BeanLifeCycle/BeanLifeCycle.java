package com.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean
{
	
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Initialization method called");
    }
    
    public void destroy() throws Exception
    {
        System.out.println("Destroy method called");
    }
    
    public void display()
    {
        System.out.println("Hello !!!");
    }
}