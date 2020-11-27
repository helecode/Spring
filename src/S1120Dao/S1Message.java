package S1120Dao;

import java.io.Serializable;
/*
 * �����ƺͱ�����һ��
 * �����������ͺͱ��ֶ�������һ��
 */
public class S1Message implements Serializable{
	
	 private int id;    
	 private String name;
	 private int age;   
	 private String sex;
	 private String  phone;
	 
	public S1Message() {
		super();
	}
	
	public S1Message(int id) {
		super();
		this.id = id;
	}

	public S1Message(int id, String name, int age, String sex,
			String phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}
	
	public S1Message(String name, int age, String sex, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}
	
	public S1Message(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "S01HibernaterFirstMessage [id=" + id + ", name=" + name
				+ ", age=" + age + ", sex=" + sex + ", phone=" + phone + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
