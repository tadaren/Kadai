package kadai160720;

import java.util.Scanner;

public class Kadai4160720 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
		int faul = 0;
		
		for(; strike < 3 && ball < 4;){
			System.out.println("ストライク=1 or ボール=2orファウル=3 ？");
			int in = stdIn.nextInt();
			if(in == 1){
				strike++;
			}else if(in == 2){
				ball++;
			}else if(in == 3 && strike < 2){
				strike++;
			}
		}
		
		System.out.println(ball+"ボール,"+strike+"ストライク");

	}

}
