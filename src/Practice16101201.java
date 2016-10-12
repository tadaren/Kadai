import java.util.Scanner;

public class Practice16101201 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力(float)：");
		float f = stdIn.nextFloat();
		System.out.print("数値を入力(double):");
		double d = stdIn.nextDouble();
		
		System.out.println("入力された数値は、float "+f+",double "+d);
		stdIn.close();
		
	}

}
