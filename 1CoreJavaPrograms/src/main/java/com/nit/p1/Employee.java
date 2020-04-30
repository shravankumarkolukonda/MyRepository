package com.nit.p1;

public class Employee implements Comparable<Employee> {
	int eid;
	String ename;
	double esal;

	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public int compareTo(Employee e) {
		if (this.eid > e.eid)
			return 1;
		if (this.eid < e.eid)
			return -1;

		return 0;
	}

	public String toString() {
		return "eid: " + eid + "\nename:" + ename + "\nesal:" + esal;
	}
}
