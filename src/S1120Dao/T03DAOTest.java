package S1120Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T03DAOTest {

	public static void main(String[] args) throws Exception {
		//��ȡ�����ļ�
				ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		    	//�õ�Daoʵ����ʵ��
				S3MessageDaoImpl messageDao= (S3MessageDaoImpl) ac.getBean("messageDao");
		    	//����Dao�����������ݿ�
				S1Message message=new S1Message(19, "name", 12, "��", "18279441494");
				messageDao.addMessage(message);
				messageDao.delete(15);
				messageDao.update(1, "1idname");
				
				for(S1Message messageA:messageDao.listMessages()){
					System.out.println(messageA);
				}

}
}