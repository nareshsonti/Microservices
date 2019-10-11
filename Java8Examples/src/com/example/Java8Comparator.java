package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Comparator {
	public static void main(String[] args) {
		// Integer sort using lamda expression
		/*
		 * List<Integer> list = new ArrayList(); list.add(34); list.add(99);
		 * list.add(45); //list.sort((String obj1, String obj2) ->
		 * obj2.compareTo(obj1)); // Collections.sort(list);
		 * //System.out.println("Natural sorting order " + list);
		 * 
		 * Collections.sort(list, (obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1
		 * : 0); System.out.println("Natural sorting order " + list);
		 */
		
		
// String : using lamda expression
		List<String> list = new ArrayList();
		
		list.add("sdet");
		list.add("java");
		//list.sort((String obj1, String obj2) -> obj2.compareTo(obj1));
		// Collections.sort(list);
		//System.out.println("Natural sorting order " + list);
		
		Collections.sort(list, (obj1, obj2) -> -(obj1.compareTo(obj2)));
		System.out.println("After Customized sorting order " + list);

	

	}

}
