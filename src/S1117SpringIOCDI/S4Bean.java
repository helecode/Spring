package S1117SpringIOCDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S4Bean {

	public static S4Bean getInstance(){
		System.out.println("ͨ��facyoty-method����ʵ����");
		return new S4Bean();
	}
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		S4Bean s4Bean=(S4Bean) ac.getBean("S4Bean");
		System.out.println("s4Bean:"+s4Bean);
	}

}
