import java.util.Scanner;

public class Practice2170125 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num1 = new int[2];
		System.out.println("1つ目の数の分子:");
		num1[0] = stdIn.nextInt();
		System.out.println("1つ目の数の分母:");
		num1[1] = stdIn.nextInt();
		int[] num2 = new int[2];
		System.out.println("1つ目の数の分子:");
		num2[0] = stdIn.nextInt();
		System.out.println("1つ目の数の分母:");
		num2[1] = stdIn.nextInt();
		stdIn.close();
		
		int[] product = new int[2];
		product[0] = num1[0]*num2[0];
		product[1] = num1[1]*num2[1];
		int divisor = commonDivisor(product[0], product[1]);
		product[0] = product[0]/divisor;
		product[1] = product[1]/divisor;

		int[] quotient = new int[2];
		quotient[0] = num1[0]*num2[1];
		quotient[1] = num1[1]*num2[0];
		divisor = commonDivisor(quotient[0], quotient[1]);
		quotient[0] = quotient[0]/divisor;
		quotient[1] = quotient[1]/divisor;
		
		System.out.println("掛け算");
		System.out.println(product[0]+"/"+product[1]);
		System.out.println("割り算");
		System.out.println(quotient[0]+"/"+quotient[1]);
	}
	
	public static int commonDivisor(int x, int y){
		if(x < y){
			int i = x;
			x = y;
			y = i;
		}
		
		while(true){
			int result = x % y;
			if(result == 0){
				return y;
			}else{
				x = y;
				y = result;
			}
		}
	}

}
