package models.employees;
import java.math.*;

import services.factories.Constants;

public abstract class Employee {
	
	
	
	private String name;
	private long id;
	private  BigDecimal salary = new BigDecimal(0);
	private boolean isDead = false;
	protected static long count = 10;
	
	
	
	public Employee(String name, BigDecimal salary, boolean isDead){
		
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
		id = (count * Constants.nrOfZero);
	}
	
	
	public String getName() {
		return name;
	}
	
	public long getId(){
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
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
