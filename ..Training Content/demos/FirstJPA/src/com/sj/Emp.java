package com.sj;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Emp
 *
 */
@Entity

@Table(name="Employee")

@TableGenerator(table = "Employee", schema = "sj1", pkColumnName = "id", name = "id")
public class Emp implements Serializable {
	@Id
	int id;
    
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	String name;
	
	private static final long serialVersionUID = 1L;

	public Emp() {
		super();
	}
   
}
