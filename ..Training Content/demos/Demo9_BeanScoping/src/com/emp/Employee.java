package com.emp;

import com.util.MyDate;

public class Employee 
{
	private String firstname="aaa";
	private String lastname="bbb";
	private MyDate birthdate=null;

	public Employee()
	{
		System.out.println("inside default constructor of Employee()");
	}

    public Employee(String firstname)
	{
		System.out.println("inside constructor Employee(String)");
		this.firstname = firstname;
	}
	
	public Employee(String firstname,String lastname)
	{
		System.out.println("inside constructor Employee(String,String)");
		this.firstname = firstname;
		this.lastname = lastname;
	}

    public Employee(String firstname,String lastname,MyDate birthdate)
	{
		System.out.println("inside constructor Employee(String,String,Date)");
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}

	public boolean equals(Object obj)
	{
		Employee emp = (Employee)obj;
		if( this.firstname.equals(emp.firstname) &&  this.lastname.equals(emp.lastname) &&
		    this.birthdate.equals(emp.birthdate)	
		)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		return "FullName :: "+ this.firstname + this.lastname + "\n" + "BirthDate :: " + this.birthdate.toString();
	}


	private static Employee getEmployee()
	{
		System.out.println("am inside private Factory Method getEmployee()");
		return new Employee();
	}

	
}