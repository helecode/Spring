package S1121SpringStruts2Hibernate;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.context.ContextLoaderListener;

@Entity
@Table(name="cat")
public class S1Cat implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date createDate;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public S1Cat(int id, String name, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.createDate = createDate;
	}
	public S1Cat(int i) {
		this.id = id;
	}
	public S1Cat(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "T01ORMCat [id=" + id + ", name=" + name + ", createDate="
				+ createDate + "]";
	}
	public S1Cat() {
		super();
	}
	
}
