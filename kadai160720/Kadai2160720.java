package kadai160720;

import java.util.Scanner;

public class Kadai2160720 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a入力:");
		double a = stdIn.nextDouble();
		System.out.print("b入力:");
		double b = stdIn.nextDouble();
		System.out.print("θ入力:");
		double theta = stdIn.nextDouble();
		
		System.out.printf("c=%.2f",Math.sqrt(((a*a)+(b*b)-2*a*b*Math.cos(theta))));
		
	}

}
