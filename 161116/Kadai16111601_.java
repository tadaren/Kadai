import java.util.Random;
import java.util.Scanner;

public class Kadai16111601_ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("フィールドのサイズ:");
		int size = stdIn.nextInt();
		System.out.print("爆弾の数:");
		int bombs = stdIn.nextInt();
		byte[][] field = new byte[size][size];
		boolean[][] openfield = new boolean[size][size];
		
		//フィールドの生成
		//ボムの配置
		for(int i = 0; i <= bombs; i++){
			Random rand = new Random();
			field[rand.nextInt(size)][rand.nextInt(size)] = 9;
		}
		//値の設定
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[i].length; j++){
				if(field[i][j] != 9){
					for(int k = -1; k <= 1; k++){
						for(int l = -1; l <= 1; l++){
							try{
								if(field[i+k][j+l]==9)field[i][j]++;
							}catch(ArrayIndexOutOfBoundsException e){
							}
						}
					}
				}
			}
		}
		//メインループ
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
			}else if(k >= size*size-bombs-1){
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
		stdIn.close();
		//終了時のフィールドの描画
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[i].length; j++){
				if(field[i][j]==9){
					System.out.print("*");
				}else{
					System.out.print(field[i][j]);
				}
			}
			System.out.println();
		}
		
		

	}

}
