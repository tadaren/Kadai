import java.util.Scanner;

public class Kadai16111602 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("漢文入力：");
		String line = stdIn.nextLine();
		stdIn.close();
		char[] after = new char[line.length()];
		
		for(int i = 0, j = 0; i < line.length(); i++,j++){
			if(line.charAt(i) == 'レ'){
				after[j-1] = line.charAt(i+1);
				after[j] = line.charAt(i-1);
				i++;
			}else{
				after[j] = line.charAt(i);
			}
		}
		
		String newline = String.valueOf(after);
        System.out.print("書き下し文：");
        System.out.print(newline);
	}
}
