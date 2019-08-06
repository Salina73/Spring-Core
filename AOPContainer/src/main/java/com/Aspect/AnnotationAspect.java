
package com.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationAspect {

	@Before("@annotation(com.Aspect.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}
