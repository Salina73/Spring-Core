
package com.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect 
{

	@Before("execution(public String getName())")
	public void getNameAdvice()
	{
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.Service.*.get*())")
	public void getAllAdvice()
	{
		System.out.println("Service method getter called");
	}
}
