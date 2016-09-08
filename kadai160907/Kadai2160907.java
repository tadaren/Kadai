package kadai160907;

import java.util.Scanner;

public class Kadai2160907 {

	public static void main(String[] args) {
		//入力部分
		Scanner stdIn = new Scanner(System.in);
		System.out.print("単語入力：");
		String input = stdIn.nextLine(); //入力された文字列
		String output = "";				//入れ替え後の文字列を入れるところ
		//for文で一文字ずつ後ろから取って入れ替え後のところに入れていく
		for(int i = input.length(); i >= 1; i--){
			output += input.substring(i-1, i);
		}
		//出力部分
		System.out.print("反転結果：");
		System.out.println(output);

	}

}
