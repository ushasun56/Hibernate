package com.yash.table.per.concrete;


/* *
 *  Create inheritance using hiber 
 * employee class which is super class this strategy consist seperated table for each and every class
 * 
 */
import javax.persistence.*;

@Entity
@Table(name = "employee1")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */

	public void setId(int id) {
		this.id = id;
	}
      /**
       * 
       * @return getName
       */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
   
 
}