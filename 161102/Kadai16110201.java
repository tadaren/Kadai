
public class Kadai16110201 {

	public static void main(String[] args) {
		int[][] table = new int[7][7];
		//表の計算
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				table[i][j] = i+j;
			}
		}

		//出力
		System.out.print("\t");
		for(int i = 1; i < table.length; i++){
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i = 1; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
