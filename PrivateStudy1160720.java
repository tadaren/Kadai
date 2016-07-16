package kadai160720;

import java.util.Scanner;

public class PrivateStudy1160720 {

	public static void main(String[] args) {
		System.out.print("数字を入力：");
		Scanner stdIn = new Scanner(System.in);
		double d = stdIn.nextDouble();
		double sq = Math.sqrt(d);
		System.out.println(sq);
	}

}
