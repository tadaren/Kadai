import java.util.Scanner;

public class Kadai16111601 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		byte[][] field = {
				{9,2,1,1},
				{2,3,9,1},
				{2,9,4,2},
				{2,9,3,9}
		};
		boolean[][] openfield = new boolean[4][4];
		
		for(int k = 0;; k++){
			//座標入力
			System.out.print("m:");
			int m = stdIn.nextInt();
			System.out.print("n:");
			int n = stdIn.nextInt();
			
			//フィールドの確認
			if(field[m][n] == 9){
				System.out.println("ゲームオーバーです");
				break;
			}else if(k >= 10){
				System.out.println("クリアです");
				break;
			}else{
				if(openfield[m][n]){
					System.out.println("すでに開いています");
					k--;
					continue;
				}else{
					openfield[m][n] = true;
				}
			}
			
			//フィールドの表示
			System.out.println("＜＜＜開いているところ＞＞＞");
			for(int i = 0; i < field.length; i++){
				for(int j = 0; j < field[i].length; j++){
					if(openfield[i][j]){
						System.out.print(field[i][j]);
					}else{
						System.out.print("-");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		//終了時処理
		System.out.println("【答え】");
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[i].length; j++){
				if(field[i][j] == 9){
					System.out.print("*");
				}else{
					System.out.print(field[i][j]);
				}
			}
			System.out.println();
		}
		
		
		stdIn.close();
	}

}
