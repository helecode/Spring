package S1120JDBCTransaction;

import java.util.Date;
import java.util.List;

import S1120Dao.S1Message;
import S1120Dao.S2MessageDao;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
public class S1TransactionRun {
	private S2MessageDao messageDao;
	
	
   public S2MessageDao getMessageDao() {
		return messageDao;
	}


	public void setMessageDao(S2MessageDao messageDao) {
		this.messageDao = messageDao;
	}


	//测试的方法：一个方法相当于就是一个事务
	public void run() {
	S1Message message = new S1Message();
	message.setId(55);
	message.setName("name");
	message.setAge(67);
	message.setSex("男");
	message.setPhone("182");
	messageDao.addMessage(message);
	System.out.println(12/0);

	}
}
