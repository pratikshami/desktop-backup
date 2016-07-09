package Autowire;

public class Employee {
	
	String name;
	int empid;
	
	public Manager manager;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Manager manager)
	{
		this.manager = manager;
	}
	
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", mgr=" + manager + ", name=" + name
				+ "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	

}
