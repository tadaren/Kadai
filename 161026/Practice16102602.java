import java.util.Scanner;

public class Practice16102602 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("要素数 n:");
		int[] a = new int[stdIn.nextInt()];
		System.out.println("入力");
		for(int i = 0; i < a.length; i++){
			System.out.print("a["+i+"]=");
			a[i] = stdIn.nextInt();
		}
		System.out.println();
		System.out.println("表示");
		for(int i = 0; i < a.length; i++){
			System.out.print("a["+i+"]="+a[i]);
			System.out.println();
		}
		//配列を逆順にしてコピー
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = a[a.length-1-i];
		}
		System.out.println();
		System.out.println("逆順コピー");
		for(int i = 0; i < b.length; i++){
			System.out.print("b["+i+"]="+b[i]);
			System.out.println();
		}
		stdIn.close();
	}

}
