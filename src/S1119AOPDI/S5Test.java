package S1119AOPDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import S1117SpringIOCDI.S2DIBean;

public class S5Test {
	public void add(){
		System.out.println("---addaddaddadd---");
	}
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		S5Test aopTest=(S5Test) ac.getBean("aopTest");
		aopTest.add();
		S1MethodBeforeAdvice methodBeforeAdvice=(S1MethodBeforeAdvice) ac.getBean("methodBeforeAdvice");
		methodBeforeAdvice.update();
	}

}
