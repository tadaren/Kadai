import java.util.Scanner;

public class Practice1611023 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] input;
		System.out.print("行数入力:");
		input = new int[stdIn.nextInt()][];
		for(int i = 0; i < input.length; i++){
			System.out.print(i+1+"行目の列数入力:");
			input[i] = new int[stdIn.nextInt()];
			for(int j = 0; j < input[i].length; j++){
				System.out.print(i+1+"行"+(j+1)+"列の値の入力:");
				input[i][j] = stdIn.nextInt();
			}
		}
		//出力
		for(int i = 0; i < input.length; i++){
			for(int j = 0; j < input[i].length; j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
