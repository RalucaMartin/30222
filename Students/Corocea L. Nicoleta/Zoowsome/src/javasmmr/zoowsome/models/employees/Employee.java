package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	String name;
	long id;
	BigDecimal salary;
	boolean isDead;

	public Employee(String name, long id, BigDecimal salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.isDead = false;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public boolean getIsDead() {
		return isDead;
	}

}
