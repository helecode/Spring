package S1121SpringStruts2Hibernate;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class S3ORMTest {

	public static void main(String[] args) {
		//spring����Hibernate
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
				//2. ȡ��bean
				S2CatDao icd=(S2CatDao)ac.getBean("catDao");
				
				 //1. ���è
				S1Cat c=new S1Cat();
				c.setName("Tom");
				c.setCreateDate(new Date());
				icd.addCat(c);
				
				
				 //2. �������ֲ���è����Ϣ
				icd.quertCat(c);
				
				/*
				* 3. ��������è����Ϣ
				*/
//				System.out.println("����è��Ӧ�ļ�����Ϣ: "+icd.listCats());
//				System.out.println("è������: "+icd.getCatsCount());
	}

}
