package S1116SpringFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S2SpringFirstTest {

	public static void main(String[] args) {
		//1.��ȡ�����ļ��õ�ApplicationContext����
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.ͨ��idȡ��bean
		S1SpringFirstBean bean=(S1SpringFirstBean) ac.getBean("springFirstBean");
		System.out.println(bean.getName()+"---"+bean.getNum());
	}

}
