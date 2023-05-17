package FizzBuzz;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		if (x % 15 == 0) {
			System.out.println("FizzBuzz");
		} else if (x % 3 == 0) {
			System.out.println("Fizz");
		} else if (x % 5 == 0) {
			System.out.println("Buzz");
		} else if(x == 666){
			System.out.println("悪魔の数字")
		}else{
			System.out.println(x);
		}

	}

}
