package kadai160720;

import java.util.Scanner;

public class Kadai3160720 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
		
		for(; strike < 3 && ball < 4;){
			System.out.println("ストライク=1 or ボール=2 ？");
			int in = stdIn.nextInt();
			if(in == 1){
				strike++;
			}else if(in == 2){
				ball++;
			}
		}
		
		System.out.println(ball+"ボール,"+strike+"ストライク");
		
	}

}
