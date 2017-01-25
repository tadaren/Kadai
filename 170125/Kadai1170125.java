import java.util.Scanner;

public class Kadai1170125 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("2進数を入力してください");
		String input = stdIn.nextLine();
		String seisu = input.substring(0, input.indexOf("."));
		String syosu = input.substring(input.indexOf(".")+1);
		stdIn.close();
		
		double result = 0;
		
		for(int i = 0; i < seisu.length(); i++){
			if(seisu.charAt(seisu.length()-i-1) == '1'){
				result += Math.pow(2, i);
			}
		}
		
		for(int i = 0; i < syosu.length(); i++){
			if(syosu.charAt(i) == '1'){
				result += Math.pow(2, (i+1)*(-1));
			}
		}
		
		System.out.println("10進数\n"+result);
	}

}
