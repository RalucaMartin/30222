package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;


public abstract class Employee {
	
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead=false;
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
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public  Employee(String name, long id, BigDecimal i, boolean isDead){
		this.name=name;
		this.id=id;
		this.salary=i;
		this.isDead=isDead;
	}

}
