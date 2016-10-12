import java.util.Scanner;

public class Kadai16101201 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("³‚Ì®”“ü—Í:");
		int input = stdIn.nextInt();
		int Octalbuffer = input;
		int Hexbuffer = input;
		
		int binary = 0;
		int Octal = 0;
		int hexadecimal = 0;
		for(int i = 1;;i=i*10){
			binary += input%2*i;
			if(input == 1){
				break;
			}
			input = input/2;
		}
		System.out.println("2i”:"+binary);

		for(int i = 1;;i=i*10){
			Octal += Octalbuffer%8*i;
			if(Octalbuffer < 8){
				break;
			}
			Octalbuffer = Octalbuffer/8;
		}
		
		System.out.println("8i”:"+Octal);
		
		for(int i = 1;;i=i*10){
			hexadecimal += Hexbuffer%16*i;
			if(Hexbuffer < 16){
				break;
			}
			Hexbuffer = Hexbuffer/16;
		}
		
		System.out.println("16i”:"+hexadecimal);
		stdIn.close();
	}

}
