import java.util.Random;

public class Practice16111601 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[100];
		for(int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(9)+1;
		}
		
		//カウント
		int[] count = new int[9];
		for(int i = 0; i < array.length; i++){
			count[array[i]-1]++;
		}
		//出力
		for(int i = 0; i < count.length; i++){
			System.out.println((i+1)+"の数は"+count[i]+"です");
		}
		
		
	}

}
