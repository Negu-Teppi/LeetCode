package com.manhlee.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

public class RestoreStrings {
	
	
	public static void main(String[] args) {
		String s="codeleet";
		int [] indices = {4,5,6,7,0,2,1,3};
		String [] arrS = s.split("");
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		String result="";
		for (int i = 0; i < s.length(); i++) {
			map1.put(indices[i], arrS[i]);
		}
		System.out.println(map1);
		/*
		 * String [] tempa = (String[]) map1.keySet().toArray(new String[map1.size()]);
		 * for (String string : tempa) { result= result.concat(string); }
		 * System.out.println(result);
		 */
		String [] tempa = (String[]) map1.values().toArray(new String[map1.size()]);
		for (String string : tempa) { 
			result= result.concat(string); 
		}
		System.out.println(result);

	}
	
}