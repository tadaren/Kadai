import java.util.Scanner;

public class Practice16111602 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("何項まで表示しますか:");
		int[] fibonacci = new int[stdIn.nextInt()];
		System.out.print("第1項:");
		fibonacci[0] = stdIn.nextInt();
		System.out.print("第2項:");
		fibonacci[1] = stdIn.nextInt();
		System.out.println("＜＜フィボナッチ数列の表示＞＞");
		for(int i = 2; i < fibonacci.length; i++){
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
		}
		//出力
		for(int i = 0; i < fibonacci.length; i++){
			System.out.print(fibonacci[i]+" ");
		}
		stdIn.close();
	}

}
