package sj;

public class Student {
    String name; 
	int rollno;
	String course;
     
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	System.out.println("Student created by default constructor");
	}

	@Override
	public String toString() {
		return "Student Details: [course=" + course + ", name=" + name + ", rollno="
				+ rollno + "]";
	}
   
}
