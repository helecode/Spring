package S1121SpringStruts2Hibernate;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class S3ORMTest {

	public static void main(String[] args) {
		//spring整合Hibernate
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
				//2. 取出bean
				S2CatDao icd=(S2CatDao)ac.getBean("catDao");
				
				 //1. 添加猫
				S1Cat c=new S1Cat();
				c.setName("Tom");
				c.setCreateDate(new Date());
				icd.addCat(c);
				
				
				 //2. 根据名字查找猫的信息
				icd.quertCat(c);
				
				/*
				* 3. 查找所有猫的信息
				*/
//				System.out.println("所有猫对应的集合信息: "+icd.listCats());
//				System.out.println("猫的数量: "+icd.getCatsCount());
	}

}
