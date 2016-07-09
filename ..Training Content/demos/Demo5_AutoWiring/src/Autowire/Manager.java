package Autowire;

public class Manager {

	String name;
	String dept;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Manager [dept=" + dept + ", name=" + name + "]";
	}	
	
}
