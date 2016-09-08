package kadai160907;

import java.util.Scanner;

public class Kadai3160907 {

	public static void main(String[] args) {
		//入力部分
		Scanner stdIn = new Scanner(System.in);
		System.out.print("文字列入力:");
		String input = stdIn.nextLine();//入力された文字列
		String output = "";				//出力用Stringクラス
		//for文で一文字ずつ読んでいく
		for(int i = 0; i < input.length(); i++){
			//読んだ文字が" "(スペース)なら出力する
			if(input.substring(i, i+1).equals(" ")){
				System.out.println(output);
				output = "";//出力用Stringクラスのリセット
			}else{	//スペースでなければ文字を出力用Stringクラスに入れる
				output += input.substring(i,i+1);
			}
		}
		//最後の単語を出力
		System.out.println(output);

	}

}
