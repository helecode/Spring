package S1119AOPDI;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class S6annoAround {

	@Around("execution(public * S1119AOPDI.*.*(..))")
	public void aroundLog(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("注解环绕通知1");
		Object result = jp.proceed();
		System.out.println("注解环绕通知2");
	}
	@Before("execution(public * S1119AOPDI.*.*(..))")
	public void before(){
		System.out.println("注解前置通知");
	}
	@After("execution(public * S1119AOPDI.*.*(..))")
	public void after(){
		System.out.println("注解后置通知");
	}
}
