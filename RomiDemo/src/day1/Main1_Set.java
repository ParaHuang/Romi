package day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1_Set {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(44);
		list.add(11);
		list.add(88);
		System.out.println(list.size());	
		System.out.println(list);
		//basic for loop
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println("data "+(i+1)+":"+list.get(i));
		}
		
		// data 1: 11
		// data 2: 22
		//....
		// data 5: 88
		//for-each/enhanced for loop
		for(Integer value:list) {
			System.out.println(value);
		}
		
		
		System.out.println();
		
		//HashSet: 
		//1.it doesn't have order
		//2.it can't set duplicate data
		//3.it doesnt have index
		Set<Integer> set = new HashSet<Integer>();
		//add data
		set.add(11);
		set.add(22);
		set.add(44);
		set.add(11);
		set.add(88);
		System.out.println(set.size());
		System.out.println(set);
		for(Integer value:set) {
			System.out.println(value);
		}
		
	}

}













