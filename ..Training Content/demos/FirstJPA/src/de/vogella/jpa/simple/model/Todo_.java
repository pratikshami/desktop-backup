package de.vogella.jpa.simple.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-18T09:33:53.218+0530")
@StaticMetamodel(Todo.class)
public class Todo_ {
	public static volatile SingularAttribute<Todo, Long> id;
	public static volatile SingularAttribute<Todo, String> summary;
	public static volatile SingularAttribute<Todo, String> description;
}
