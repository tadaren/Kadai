
public class Practice1611024 {

	public static void main(String[] args) {
		int[][] table = new int[10][10];
		
		for(int i = 1; i < table.length; i++){
			for(int j = 1; j < table.length; j++){
				table[i][j] = i*j;
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
