package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employees {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead = false; // each employee is alive

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return this.id;
	}

	public void setId() {// unique id
		long id = (long) (Math.random() * 10000000 * 1000000);
		this.id = id;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getIsDead() {
		return this.isDead;
	}

	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}

	public Employees() {

	}

	public Employees(String name, BigDecimal Salary, boolean isDead) {
		setName(name);
		setSalary(Salary);
		setIsDead(isDead);
	}
}
