
public class Practice16110902 {

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
		for(int i = array.length-1; i >= 0;i--){
			for(int j=0;j<8;j++){
				System.out.printf("%c",array[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
