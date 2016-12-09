package javasmmr.zoowsome.models.employees;
import java.math.*;
import java.util.Random;

public abstract class Employee {

	
	long rangeMin = 1000000000000l;
	long rangeMax = 9999999999999l;
	Random r = new Random();
	long id = rangeMin + (rangeMax - rangeMin) * r.nextLong();
	
	String name;
	BigDecimal salary;
	boolean isDead = false;
	public Employee(){
	
	}
	
	public Employee(String name, BigDecimal salary, boolean isDead){
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
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
