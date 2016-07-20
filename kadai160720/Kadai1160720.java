package kadai160720;

import java.util.Scanner;

public class Kadai1160720 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("1つめ実数入力:");
		double one = stdIn.nextDouble();
		System.out.print("2つめ実数入力:");
		double two = stdIn.nextDouble();
		System.out.print("3つめ実数入力:");
		double three = stdIn.nextDouble();
		
		System.out.println("最大値は" + Math.max(one, Math.max(two, three)));
		
	}

}
