package com.nit.p1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RepeatedCharacter {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		Date min = null;
		Date max = null;
		Date eStartDate = null;
		Date eEndDate = null;
		try {
			min = sdf.parse("10/12/2021");
			max = sdf.parse("10/12/4000");
			eStartDate = sdf.parse("10/12/2022");
			eEndDate = sdf.parse("01/01/2022");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(min);
		System.out.println(max);
		// System.out.println(d);

		if ((eStartDate.compareTo(min) >= 0 && eStartDate.compareTo(max) <= 0)
				&& (eEndDate.compareTo(min) >= 0 && eEndDate.compareTo(max) <= 0)) {
			System.out.println("true");
		}
	}

}
