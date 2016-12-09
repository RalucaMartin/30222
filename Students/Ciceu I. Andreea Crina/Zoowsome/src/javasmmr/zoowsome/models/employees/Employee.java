package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private BigDecimal salary;
	public boolean isDead = false;
	private long id;
	
	public Employee(String name, BigDecimal salary, boolean isDead){
		setName(name);
		setSalary(salary);
		setIsDead(isDead);
		
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public BigDecimal getSalary(){
		return this.salary;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	public boolean getIsDead(){
		return this.isDead;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}
	public long getId(){
		return this.id;
	}
	public void setId(long id) {
		this.id = (long)(Math.random() * 10000000 * 1000000);
	}
	
}
