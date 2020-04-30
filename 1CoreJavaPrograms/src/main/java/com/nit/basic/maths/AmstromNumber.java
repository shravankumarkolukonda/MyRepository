package com.nit.basic.maths;

public class AmstromNumber {

	public static void isAmstrom(int num) {
        int org=num;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum + (d * d * d);
			num = num / 10;
		}
        if(sum==org) {
        	System.out.println(org + " is an Amstrom number");
        }
        else {
        	System.out.println(org + " is not an Amstrom number");
        }
	}
    public static void printAmstromNumbers(int num)
    {
    	
    }
	public static void main(String[] args) {
		isAmstrom(3);

	}

}
