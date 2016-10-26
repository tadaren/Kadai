import java.util.Scanner;

public class Kadai16102601 {

	public static void main(String[] args) {
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int[][] sum = new int[2][2];
		int[][] dif= new int[2][2];
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("行列aの入力");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print("a["+i+"]["+j+"]:");
				a[i][j] = stdIn.nextInt();
			}
		}
		System.out.println("行列bの入力");
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length; j++){
				System.out.print("b["+i+"]["+j+"]:");
				b[i][j] = stdIn.nextInt();
			}
		}
		
		//足し算
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		//引き算
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				dif[i][j] = a[i][j] - b[i][j];
			}
		}
		//出力
		System.out.println("足し算の結果");
		for(int i = 0; i < sum.length; i++){
			for(int j = 0; j < sum[i].length; j++){
				System.out.println("sum["+i+"]["+j+"]:"+sum[i][j]);
			}
		}
		System.out.println("引き算の結果");
		for(int i = 0; i < dif.length; i++){
			for(int j = 0; j < dif[i].length; j++){
				System.out.println("dif["+i+"]["+j+"]:"+dif[i][j]);
			}
		}
		
		stdIn.close();
	}

}
