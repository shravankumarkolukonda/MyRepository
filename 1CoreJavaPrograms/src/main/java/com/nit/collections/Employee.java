package com.nit.collections;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {

	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee e) {
		if (this.id < e.id)
			return -1;
		if (id > e.id)
			return 1;
		return 0;
	}

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.id < e2.id)
			return -1;
		if (e1.id > e2.id)
			return 1;
		return 0;
	}

	public String toString() {
		return "id: " + id + "\n" + "name: " + name + "\n" + "salary: " + salary;
	}

}
