package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	String name;
	Long id ;
	BigDecimal salary;
	boolean isDead;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(Long id) {
		long number1 = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;
		this.id = number1;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public Boolean getIsDead() {
		return this.isDead;
	}
	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
	
	/*public Employee(String name, BigDecimal salary, Boolean isDead) {
		this.setName(name);
		this.setSalary(salary);
		this.setIsDead(isDead);
	} */
}
