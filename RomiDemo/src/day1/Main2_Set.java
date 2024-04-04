package day1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main2_Set {

	public static void main(String[] args) {
		// 10 people:
		// Jack, Tom, Alex, Jane,Frank,David,Daniel,Mike,Jhon,Alice
		// invite 5 of them to join a party
		// which 5? write a program to pick 5 people randomly
		
		String[] ary = {"Jack","Tom","Alex", "Jane","Frank","David","Daniel","Mike","Jhon","Alice"};
	
		//set to save 5 people's name
		Set<String> set = new HashSet<>();
		
		Random random = new Random();
		
		while(set.size()<5) {
			int index = random.nextInt(ary.length);
//			System.out.println(ary[index]);
			set.add(ary[index]);
		}
		System.out.println(set);
	}

}

