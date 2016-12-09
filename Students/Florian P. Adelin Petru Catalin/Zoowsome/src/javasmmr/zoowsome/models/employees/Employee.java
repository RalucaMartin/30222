package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	public String name;
	public Long id;
	public BigDecimal salary;
	public Boolean isDead=false;
	public Employee(){
	}
	public Employee(String name, Long id, BigDecimal salary){
		setName(name);
		setId();
		setSalary(salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId() {
		this.id = (long) Math.floor(Math.random()*9000000000000L) + 1000000000000L;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Boolean getIsDead() {
		return isDead;
	}
	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
}
