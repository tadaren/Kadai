import java.util.Scanner;

public class Kadai16101201 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("正の整数入力:");
		int input = stdIn.nextInt();
		int Octalbuffer = input;
		int Hexbuffer = input;
		
		long binary = 0;
		long Octal = 0;
		long hexadecimal = 0;
		for(long i = 1;;i=i*10){
			binary += input%2*i;
			if(input == 1){
				break;
			}
			input = input/2;
		}
		System.out.println("2進数:"+binary);

		for(long i = 1;;i=i*10){
			Octal += Octalbuffer%8*i;
			if(Octalbuffer < 8){
				break;
			}
			Octalbuffer = Octalbuffer/8;
		}
		
		System.out.println("8進数:"+Octal);
		
		for(long i = 1;;i=i*10){
			hexadecimal += Hexbuffer%16*i;
			if(Hexbuffer < 16){
				break;
			}
			Hexbuffer = Hexbuffer/16;
		}
		
		System.out.println("16進数:"+hexadecimal);
		stdIn.close();
	}

}
