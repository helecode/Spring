package S1116SpringFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S2SpringFirstTest {

	public static void main(String[] args) {
		//1.读取配置文件得到ApplicationContext对象
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过id取得bean
		S1SpringFirstBean bean=(S1SpringFirstBean) ac.getBean("springFirstBean");
		System.out.println(bean.getName()+"---"+bean.getNum());
	}

}
