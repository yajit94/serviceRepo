package stf;

public class Student {
	private Integer eid;
	private String ename;
	private String cls;
	
	
	



	public Integer getEid() {
		return eid;
	}



	public void setEid(Integer eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getCls() {
		return cls;
	}



	public void setCls(String cls) {
		this.cls = cls;
	}



	public void getStudentDetails()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(cls);
	}
	
}
