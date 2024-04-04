package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
//		String[] ary = {"Jack","Tom","Alex", "Jane","Frank","David","Daniel","Mike","Jhon","Alice"};
//		List<String> list = new ArrayList<String>();
//		for(String s:ary) {
//			list.add(s);
//		}
		//list you create in this way is not allowed to modify the structure
		List<String> list = Arrays.asList("Jack","Tom","Alex", "Jane","Frank","David","Daniel","Mike","Jhon","Alice");
//		Arrays: a tool for array
//		Collections: a tool for all types of Collection
		Collections.shuffle(list);
		
//		System.out.println(list);
		for(int i=0 ; i<5 ; i++) {
			System.out.println(list.get(i));
		}
	}

}

