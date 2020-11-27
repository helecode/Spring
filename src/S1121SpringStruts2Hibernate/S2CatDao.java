package S1121SpringStruts2Hibernate;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class S2CatDao extends HibernateDaoSupport{
	//生成对应的表
	public void createTable(S1Cat cat){
		super.getHibernateTemplate().persist(cat);
	}
	
	public void addCat(S1Cat cat){
		super.getHibernateTemplate().save(cat);

	
		
	}
	public void deleteCat(S1Cat cat){
		List<S1Cat> catList=super.getHibernateTemplate().find("from S1Cat where id=?",cat.getId());
		super.getHibernateTemplate().delete(catList.get(0));
		}
	public void updateCat(S1Cat cat){
		super.getHibernateTemplate().update(cat);
		
	}
	public void quertCat(S1Cat cat){
		String sql="from S1Cat where name = '"+cat.getName()+"' ";

		List<S1Cat> catList=super.getHibernateTemplate().find(sql);
		for(S1Cat c:catList){
			System.out.println(c.toString());
		}
		
	}
	public List<S1Cat> displayCat(){
		String sql="from S1Cat ";
		List<S1Cat> catList=super.getHibernateTemplate().find(sql);
		System.out.println("sss:"+catList.size());
		return catList;
		
	}
}
