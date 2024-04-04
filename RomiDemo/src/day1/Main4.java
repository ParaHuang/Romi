package day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main4 {
	public static void main(String[] args) {
		String[] ary = {"Jack","Tom","Alex", "Jane","Frank","David","Daniel","Mike","Jhon","Alice"};
		List<String> list = new ArrayList<String>();
		for(String s:ary) {
			list.add(s);
		}
		
		Random random = new Random();
		for(int i=0 ; i<5 ; i++) {//control what I want to do for 5 times
			int index = random.nextInt(list.size());
			String name = list.remove(index);//which element was removed from list
//			System.out.println(name);
		}
		System.out.println(list);
		
//		list.remove("Jack");
//		System.out.println(list);
	}
}

