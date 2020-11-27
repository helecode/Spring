package S1120Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T03DAOTest {

	public static void main(String[] args) throws Exception {
		//读取配置文件
				ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		    	//得到Dao实现类实例
				S3MessageDaoImpl messageDao= (S3MessageDaoImpl) ac.getBean("messageDao");
		    	//测试Dao方法操作数据库
				S1Message message=new S1Message(19, "name", 12, "男", "18279441494");
				messageDao.addMessage(message);
				messageDao.delete(15);
				messageDao.update(1, "1idname");
				
				for(S1Message messageA:messageDao.listMessages()){
					System.out.println(messageA);
				}

}
}