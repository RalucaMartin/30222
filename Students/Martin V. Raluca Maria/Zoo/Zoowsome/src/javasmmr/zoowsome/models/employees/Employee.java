package javasmmr.zoowsome.models.employees;
import java.math.*;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private Boolean isDead = false;
	
	public void setName( String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId() {
		this.id = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;
	}
	public long getId() {
		setId();
		return id;
	}
	
	public void setSalary( BigDecimal salary) {
		this.salary = salary;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	
	public void setIsDead( Boolean isDead ) {
		this.isDead = isDead;
	}
	public Boolean getIsDead() {
		return isDead;
	}
	
	public Employee( String name, BigDecimal salary, Boolean isDead) {
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
	}
}
