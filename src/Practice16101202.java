import java.util.Scanner;

public class Practice16101202 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�C��:");
		double temp = stdIn.nextDouble();
		System.out.print("���x:");
		double hum = stdIn.nextDouble();
		
		double output = 0.81*temp+0.01*hum*(0.99*temp-14.3)+46.3;
		
		System.out.println("");
		System.out.printf("�s���w��:%.2f",output);
		
		stdIn.close();

	}

}
