package models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	public String name;
	public Long id;
	public boolean isDead = false;
	public BigDecimal salary;
	
	public Employee(String name, boolean isDead, BigDecimal salary){
		setName(name);
		setDead(isDead);
		setSalary(salary);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public long getId(){
		setId();
		return id;
	}
	
	public void setId(){
		this.id = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;
	}

}
