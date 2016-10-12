import java.util.Scanner;

public class Kadai_ {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("³‚Ì®”“ü—Í:");
		int input = stdIn.nextInt();
		
		System.out.println(""+ChangeHex(input, 2));
		System.out.println(""+ChangeHex(input, 8));
		System.out.println(""+ChangeHex(input, 16));
		
		stdIn.close();
	}
	
	public static int ChangeHex(int in, int hex){
		int out = 0;
		for(int i = 1;;i=i*10){
			out += in%hex*i;
			if(in < hex){
				break;
			}
			in = in/hex;
		}
		return out;
	}

}
