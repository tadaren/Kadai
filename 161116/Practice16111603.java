import java.util.Scanner;

public class Practice16111603 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("10進整数：");
		int in = stdIn.nextInt();
		System.out.print("n：");
		int hex = stdIn.nextInt();
		
		byte[] output = new byte[6];
		for(int i = output.length-1; i >= 0; in = in/hex, i--){
			output[i] = (byte)(in%hex);
			if(in < hex){
				break;
			}
		}
		System.out.print("変換：");
		for(int i = 0; i < output.length; i++){
			System.out.print(output[i]);
		}
		stdIn.close();
	}
}
