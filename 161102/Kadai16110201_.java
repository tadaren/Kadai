
public class Kadai16110201_ {

	public static void main(String[] args) {
		int[][] table = new int[6][6];

		System.out.print("\t");
		for(int i = 1; i < table[0].length+1; i++){
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i = 0; i < table.length; i++){
			System.out.print(i+1+"\t");
			for(int j = 0; j < table.length; j++){
				table[i][j] = i+j+2;
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 2; i < 13; i++){
			System.out.printf("%d:\t%05.2f%%\n", i, tableKeyProb(table, i));
		}
	}

	public static double tableKeyProb(int[][] table, int key){
		int count = 0;
		int elementCount = 0;
		for(int i = 0; i < table.length; i++){
			elementCount += table[i].length;
			for(int j = 0; j < table.length; j++){
				if(table[i][j] == key){
					count++;
				}
			}
		}
		return (double)count/elementCount;
	}

}
