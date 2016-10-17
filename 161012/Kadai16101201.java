import java.util.Scanner;

public class Kadai16101201 {

	public static void main(String[] args) {
		final String TABLE = "0123456789ABCDEF";
		Scanner stdIn = new Scanner(System.in);
		System.out.print("正の整数入力:");
		int input = stdIn.nextInt();
		
		String binary = "";
		for(int i = input;;i = i/2){
			binary = TABLE.substring(i%2,i%2+1)+binary;
			if(i < 2){
				break;
			}
		}
		System.out.println("2進数:"+binary);

		String octal = "";
		for(int i = input;;i = i/8){
			octal = TABLE.substring(i%8,i%8+1)+octal;
			if(i < 8){
				break;
			}
		}
		//System.out.printf("8進数:%o\n",input);
		System.out.println("8進数:"+octal);
		
		String hexadecimal = "";
		for(int i = input;;i = i/16){
			hexadecimal = TABLE.substring(i%16,i%16+1)+hexadecimal;
			if(i < 16){
				break;
			}
		}
		//System.out.printf("16進数:%x\n",input);
		System.out.println("16進数:"+hexadecimal);
		stdIn.close();
	}
}
