package com.nit.p1;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.eid > e2.eid)
			return -1;
		if(e1.eid < e2.eid)
			return 1;
		return 0;
	}
   
}
