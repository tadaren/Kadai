
public class Practice16101903 {

	public static void main(String[] args) {
		int[] score = {54,79,83,100,28};
		
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			sum += score[i];
		}
		System.out.printf("合計  %d 平均 %.1f", sum,(double)sum/score.length);

	}

}
