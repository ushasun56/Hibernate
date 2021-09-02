package com.yash.table.per.concrete;

import javax.persistence.*;

@Entity
@Table(name = "regularemp")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
@AttributeOverride(name = "name", column = @Column(name = "name")) })

public class Regular_Employee extends Employee {

	@Column(name = "salary")
	private float salary;

	@Column(name = "bonus")
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Regular_Employee [salary=" + salary + ", bonus=" + bonus + "]";
	}

    
}