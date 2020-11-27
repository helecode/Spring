package S1120Dao;

import java.util.List;

public interface S2MessageDao {
		//����id��ȡS1Message����
		public String getMessageName(Integer id);
		public void addMessage(S1Message Message);//���S1Message����
		public int getMessagesCount();//��������S1Message����Ŀ
		public List<S1Message> listMessages();//�������е�S1Message
		public List<S1Message> findAllMessages();//��ѯ���м�¼
		public int countRows();//��ѯ��¼��
		public int delete(int id);//ɾ����¼
		public int update(int id,String name);//�޸�
		
}
