package S1120Dao;

import java.util.List;

public interface S2MessageDao {
		//根据id获取S1Message姓名
		public String getMessageName(Integer id);
		public void addMessage(S1Message Message);//添加S1Message对象
		public int getMessagesCount();//返回所有S1Message的数目
		public List<S1Message> listMessages();//返回所有的S1Message
		public List<S1Message> findAllMessages();//查询所有记录
		public int countRows();//查询记录数
		public int delete(int id);//删除记录
		public int update(int id,String name);//修改
		
}
