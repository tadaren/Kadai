import java.util.Scanner;

public class Kadai_ {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("³‚Ì®”“ü—Í:");
		int input = stdIn.nextInt();
		
		System.out.println(ChangeHexString(input, 2));
		System.out.println(ChangeHexString(input, 8));
		System.out.println(ChangeHexString(input, 16));
		
		stdIn.close();
	}
	
	public static long ChangeHex(int in, int hex){
		long out = 0;
		for(long i = 1;;i=i*10){
			out += in%hex*i;
			if(in < hex){
				break;
			}
			in = in/hex;
		}
		return out;
	}
	
	public static String ChangeHexString(int in, int hex){
		String table = "0123456789ABCDEF";
		String output = "";
		for(;;){
			output = table.substring(in%hex,in%hex+1)+output;
			if(in < hex){
				break;
			}
			in = in/hex;
		}
		return output;
	}
	
	public static String ChangeHexString(long in, int hex){
		String table = "0123456789ABCDEF";
		String output = "";
		for(;;){
			output = table.substring((int)in%hex,(int)in%hex+1)+output;
			if(in < hex){
				break;
			}
			in = in/hex;
		}
		return output;
	}

}
