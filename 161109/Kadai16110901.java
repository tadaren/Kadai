

public class Kadai16110901 {

	public static void main(String[] args) {
		char[ ][ ] array={
				{'*',' ',' ',' ',' ',' ',' ','*'},
				{' ','*',' ',' ',' ',' ',' ','*'},
				{' ',' ','*',' ',' ',' ',' ','*'},
				{' ',' ',' ','*',' ',' ',' ','*'},
				{' ',' ',' ',' ','*',' ',' ','*'},
				{' ',' ',' ',' ',' ','*',' ','*'},
				{' ',' ',' ',' ',' ',' ','*','*'},
				{'*','*','*','*','*','*','*','*'},
		};
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				System.out.printf("%c",array[i][j]);
			}
			for(int j = array[i].length-1; j >= 0; j--){
				System.out.printf("%c",array[i][j]);
			}
			System.out.printf("\n");
		}
		for(int i = array.length-1; i >= 0; i--){
			for(int j = 0; j < 8; j++){
				System.out.printf("%c",array[i][j]);
			}
			for(int j = array[i].length-1; j >= 0; j--){
				System.out.printf("%c",array[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
