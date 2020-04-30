package com.nit.java8.streams;
public class Employee {
	
	private int eid;
	private String ename;
	private double esal;
	private int dept;
	private int version;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String toString() {
		return "Emp ID:" + eid + "\nEname: " + ename + "\nEsal: " + esal + "\nDept :" + dept;
	}
}