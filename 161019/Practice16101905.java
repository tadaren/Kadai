import java.util.Scanner;

public class Practice16101905 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("人数を入力：");
		int[] score = new int[stdIn.nextInt()];
		
		for(int i = 0; i < score.length; i++){
			System.out.print((i+1)+"人目の点数：");
			score[i] = stdIn.nextInt();
		}
		
		int sum = 0;
		int max = 0;
		int min = 100;
		for(int i = 0; i < score.length; i++){
			sum += score[i];
			max = Math.max(max, score[i]);
			min = Math.min(min, score[i]);
		}
		System.out.printf("合計  %d 平均 %.1f\n", sum,(double)sum/score.length);
		System.out.println("最大点 "+max+"  最小点 "+min);
		stdIn.close();

	}

}
