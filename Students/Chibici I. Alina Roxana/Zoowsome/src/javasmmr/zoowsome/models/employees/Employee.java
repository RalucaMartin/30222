package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	
	//attributes
	private String name;
	private long id;
	private BigDecimal salary;
	private Boolean isDead;
	
	//constructor
	public Employee (String name, long id, BigDecimal salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.isDead = false;
	}
	
	//methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
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
