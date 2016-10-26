import java.util.Random;
import java.util.Scanner;

public class Practice16102604 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;
		int[] a = new int[n];
		
		for(int j = 0; j < n; j++){
			a[j] = rand.nextInt(10);
		}
		
		System.out.print("配列の全要素の値\n{ ");
		for(int j = 0; j < n; j++){
			System.out.print(a[j] + " ");
		}
		System.out.println("}");
		
		System.out.print("探す数値:");
		int key = stdIn.nextInt();
		
		int i;
		for(i = n-1; 0 <= i; i--){
			if(a[i] == key){
				break;
			}
		}
		if(i >= 0){
			System.out.println("それはa[" + i + "]にあります。");
		}else{
			System.out.println("それはありません。");
		}

	}

}
