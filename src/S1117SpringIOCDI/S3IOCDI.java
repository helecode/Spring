package S1117SpringIOCDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S3IOCDI {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("ac:"+ac);
		S2DIBean t02DIbean=(S2DIBean) ac.getBean("s2DIBean");
		System.out.println(t02DIbean.getDIBean().getName()+"--"+t02DIbean.getDIBean().getPass()+"---"+t02DIbean.getId()+"--"+t02DIbean.getJob());
	}
}
