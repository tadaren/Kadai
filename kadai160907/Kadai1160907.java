package kadai160907;

import java.util.Scanner;

public class Kadai1160907 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String log = "uchida"; //一つ前の入力をためておくStringクラス
		System.out.println(log); //しりとりの最初の文字を出力
		for(;;){
			//入力部分
			System.out.print("単語入力：");
			String input = stdIn.nextLine();
			//前回の入力と今回の最初の文字の比較
			if(!(log.substring(log.length()-1).equals(input.substring(0, 1)))){
				System.out.println("しりとりになっていません。");
				break;
			//入力の最後の文字が"n"かどうかを判定
			}else if(input.substring(input.length()-1).equals("n")){
				System.out.println("nで終了しました。");
				break;
			}
			log = input; //今回の入力を前回の入力のところに移す
			
		}

	}

}
