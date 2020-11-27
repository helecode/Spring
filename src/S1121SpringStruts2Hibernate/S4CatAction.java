package S1121SpringStruts2Hibernate;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


public class S4CatAction extends ActionSupport{
	private S2CatDao SSHcatDao;
	private S1Cat cat;
	private List<S1Cat> catList;
	@Override
	public String execute() throws Exception {
		System.out.println("½øÈëaction");
		catList=SSHcatDao.displayCat();
		System.out.println("catList:"+catList.size());
		return  "catListSuccess";
	}

	public S1Cat getCat() {
		return cat;
	}
	public void setCat(S1Cat cat) {
		this.cat = cat;
	}
	public S2CatDao getSSHcatDao() {
		return SSHcatDao;
	}
	public void setSSHcatDao(S2CatDao sSHcatDao) {
		SSHcatDao = sSHcatDao;
	}
	public List<S1Cat> getCatList() {
		return catList;
	}
	public void setCatList(List<S1Cat> catList) {
		this.catList = catList;
	}


	
	
}
