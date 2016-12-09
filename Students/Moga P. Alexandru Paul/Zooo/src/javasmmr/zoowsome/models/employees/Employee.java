package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.UUID;

import javasmmr.zoowsome.models.animal.Animal;

public abstract class Employee {
	String name;
	long id;
    BigDecimal salary;
    boolean isDead=false;
    
	public Employee(String name, long id, BigDecimal salary, boolean isDead) {
		this.name = name;
		this.id = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;
		this.salary = salary;
		this.isDead = isDead;
	}
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
	
    

}
