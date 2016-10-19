
import java.util.Scanner;

public class Practice16101904 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("人数を入力：");
		int[] score = new int[stdIn.nextInt()];
		
		for(int i = 0; i < score.length; i++){
			System.out.print((i+1)+"人目の点数：");
			score[i] = stdIn.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			sum += score[i];
		}
		System.out.printf("合計  %d 平均 %.1f", sum,(double)sum/score.length);
		stdIn.close();
	}

}
