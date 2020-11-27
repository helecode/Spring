package S1120JDBCTransaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import S1120Dao.S1Message;
import S1120Dao.S3MessageDaoImpl;
//事务操作测试
public class S2TranactionTest {
	public static void main(String[] args) {
    //1. 读取配置文件
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		S1TransactionRun  tr=(S1TransactionRun)ac.getBean("transactionRun");
		//因为出现了错误,为了保持事务的原子性,之前插入的操作进行回滚
		tr.run();
//		S3MessageDaoImpl messageDao  =(S3MessageDaoImpl)ac.getBean("transactionRun");
//		//因为出现了错误,为了保持事务的原子性,之前插入的操作进行回滚
//		messageDao.addMessageA(new S1Message(111));
	}
}
