package day1;

import java.util.Random;

public class Main3_Random {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt();//generate a big random number
		System.out.println(x);
		int y = random.nextInt(5);//0~4. generate a random number from 0~ bound-1
		System.out.println(y);
		int z = random.nextInt(1, 5);//1~4. generate a random number from origin ~ bound-1
		System.out.println(z);
	}

}

