import java.util.Scanner;

public class Practice1611023 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] input;
		System.out.print("�s������:");
		input = new int[stdIn.nextInt()][];
		for(int i = 0; i < input.length; i++){
			System.out.print(i+1+"�s�ڂ̗񐔓���:");
			input[i] = new int[stdIn.nextInt()];
			for(int j = 0; j < input[i].length; j++){
				System.out.print(i+1+"�s"+(j+1)+"��̒l�̓���:");
				input[i][j] = stdIn.nextInt();
			}
		}
		//�o��
		for(int i = 0; i < input.length; i++){
			for(int j = 0; j < input[i].length; j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
