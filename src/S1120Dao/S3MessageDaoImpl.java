package S1120Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class S3MessageDaoImpl extends JdbcDaoSupport implements S2MessageDao{

	@Override
	public String getMessageName(Integer id) {
		String sql="select name from message where id="+id;
		String name=super.getJdbcTemplate().queryForObject(sql, String.class);
		return name;
	}

	@Override
	public void addMessage(S1Message message) {
		String sql="insert into message (id,name,age,sex,phone)values ('"+message.getId()+"','"+message.getName()+"',?,?,?)";
		super.getJdbcTemplate().update(sql,message.getAge(),message.getSex(),message.getPhone());
		System.out.println("添加成功");
	}

	@Override
	public int getMessagesCount() {
		String sql="select count(*) from message";
		int c=super.getJdbcTemplate().queryForInt(sql);
		return c;
	}

	@Override
	public List<S1Message> listMessages() {
		String listSql="select * from message";
		List<S1Message> messageList=new ArrayList<S1Message>();
		List<Map<String,Object>> all=super.getJdbcTemplate().queryForList(listSql);
		for(Map<String,Object> m:all){
			S1Message message=new S1Message();
			message.setId((int)m.get("id"));
			message.setName((String)m.get("name"));
			message.setAge((int)m.get("age"));
			message.setSex((String)m.get("sex"));
			message.setPhone((String)m.get("phone"));
			messageList.add(message);
		}
		
		return messageList;
	}

	@Override
	public List<S1Message> findAllMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		String sql="delete from message where id=?";
		int a=super.getJdbcTemplate().update(sql, id);
		return a;
	}

	@Override
	public int update(int id, String name) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void transactionManager(S1Message message,int id){
		String sql="insert into message (id,name,age,sex,phone)values ('"+message.getId()+"','"+message.getName()+"',?,?,?)";
		super.getJdbcTemplate().update(sql,message.getAge(),message.getSex(),message.getPhone());
		System.out.println("添加成功："+(12/0));
		String sql1="delete from message where id=?";
		int a=super.getJdbcTemplate().update(sql1, id);
		
	}
	public void addMessageA(S1Message message) {
		String sql="insert into message (id,name,age,sex,phone)values ('"+message.getId()+"','"+message.getName()+"',?,?,?)";
		super.getJdbcTemplate().update(sql,message.getAge(),message.getSex(),message.getPhone());
		System.out.println("添加成功:"+5/0);
		
	}
}
