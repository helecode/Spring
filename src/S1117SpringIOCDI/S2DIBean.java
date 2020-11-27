package S1117SpringIOCDI;

public class S2DIBean {
	private int id;
	private String job;
	private S1DIBean DIBean;
	public int getId() {
		System.out.println("ididididididi");
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public S1DIBean getDIBean() {
		return DIBean;
	}
	public void setDIBean(S1DIBean dIBean) {
		DIBean = dIBean;
	}

	
}
