package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private Boolean isDead;
	
	public Employee(String name, BigDecimal salary, Boolean isDead) {
		setName(name);
		setSalary(salary);
		setIsDead(isDead);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return this.id;
	}
	public void setId() {
		Random random = new Random();
		this.id = random.nextLong();
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

}
