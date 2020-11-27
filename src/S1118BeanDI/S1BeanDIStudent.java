package S1118BeanDI;

import java.util.Date;

public class S1BeanDIStudent {
	private int no;//学号
	private String name;//姓名
	private double score;//分数
	private Date birthday; //出生日期
	
	public S1BeanDIStudent(int no, String name, double score, Date birthday) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
		this.birthday = birthday;
	}
	
	public S1BeanDIStudent() {
		super();
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "S1BeanDIStudent [no=" + no + ", name=" + name + ", score="
				+ score + ", birthday=" + birthday + "]";
	}
	
}
