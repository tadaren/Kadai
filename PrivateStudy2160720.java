package kadai160720;

import java.util.Scanner;

public class PrivateStudy2160720 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("実数a入力：");
		double a = stdIn.nextDouble();
		System.out.print("実数b入力：");
		double b = stdIn.nextDouble();
		System.out.println("a / b = " + Math.round(a / b));
		System.out.println("a ^ b = " + Math.pow(a, b));
		System.out.println("a と b の小さい方は " + Math.min(a, b));
		System.out.println("ルートa + ルートb = " + (Math.sqrt(a) + Math.sqrt(b)));
		System.out.println("乱数a = "+Math.random()+", 乱数b = " +Math.random());
	}

}
