package S1120JDBCTransaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import S1120Dao.S1Message;
import S1120Dao.S3MessageDaoImpl;
//�����������
public class S2TranactionTest {
	public static void main(String[] args) {
    //1. ��ȡ�����ļ�
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		S1TransactionRun  tr=(S1TransactionRun)ac.getBean("transactionRun");
		//��Ϊ�����˴���,Ϊ�˱��������ԭ����,֮ǰ����Ĳ������лع�
		tr.run();
//		S3MessageDaoImpl messageDao  =(S3MessageDaoImpl)ac.getBean("transactionRun");
//		//��Ϊ�����˴���,Ϊ�˱��������ԭ����,֮ǰ����Ĳ������лع�
//		messageDao.addMessageA(new S1Message(111));
	}
}
