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
		System.out.println("ע�⻷��֪ͨ1");
		Object result = jp.proceed();
		System.out.println("ע�⻷��֪ͨ2");
	}
	@Before("execution(public * S1119AOPDI.*.*(..))")
	public void before(){
		System.out.println("ע��ǰ��֪ͨ");
	}
	@After("execution(public * S1119AOPDI.*.*(..))")
	public void after(){
		System.out.println("ע�����֪ͨ");
	}
}
