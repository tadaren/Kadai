package kadai160713;

import java.util.Scanner;

public class PrivateStudy4160713 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;
		double ave = 0;
		for(;;){
			System.out.print("整数を入力：");
			int n = stdIn.nextInt();
			if(n >= 0){
				a++;
				sum += n;
			}else{
				b++;
			}
			if(sum>=100)
				break;
		}
		ave = sum/a;
		System.out.println("データ数="+a);
		System.out.println("無効データ数="+b);
		System.out.println("合計="+sum);
		System.out.printf("平均=%.1f",ave);

	}

}
