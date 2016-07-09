package sj;

public class Student {
    String name; 
	int rollno;
	String course;
     
	
	public Student() {
		// TODO Auto-generated constructor stub
	System.out.println("Student created by default constructor");
	}
    
	public Student(String name, int rollno, String course) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student Details: [course=" + course + ", name=" + name + ", rollno="
				+ rollno + "]";
	}
   
}
