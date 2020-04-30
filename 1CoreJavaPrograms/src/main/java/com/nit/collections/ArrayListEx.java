package com.nit.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static List<Integer> removeDuplicates(ArrayList<Integer> al) {
		for (int i = 0; i < al.size(); i++) {
			for (int j = i+1; j < al.size(); j++) {
               if(al.get(i).equals(al.get(j)))
               {
            	   al.remove(j);
            	   j--;
               }
			}
		}
		return al;
	}

	public static void main(String[] args) {
         ArrayList<Integer> al=new ArrayList<Integer>();
         al.add(10);
         al.add(20);
         al.add(30);
         al.add(10);
         al.add(20);
         al.add(30);
         
       List<Integer> l=  removeDuplicates(al);
       
       for(Integer i: l)
    	   System.out.println(i);
	}

}
