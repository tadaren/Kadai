import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class Kadai0304 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//配列の数式を入力(係数 != 0)
		double[] in = new double[3];
		for(int i = in.length-1; i >= 0; i--){
			System.out.print("x^"+i+"の係数:");
			in[i] = stdIn.nextDouble();
			if(in[i] == 0){
				i--;
				System.out.println("再入力してください");
			}

		}
		//出力
		printPolynomial(in);	//初期の数式
		in = deleteZero(in);	//後ろの0を消去
		double[] dedIn = differential(in);	//数式を微分
		printPolynomial(dedIn);				//出力
		double outX = -dedIn[0] / dedIn[1];	//微分した式からXを求める
		double outY = substitution(in, outX);	//Xを代入しYを求める
		System.out.println("x = " + outX);	//出力
		System.out.println("y = " + outY);
	}
	//引数の数式にkを代入した結果の値を返す
	public static double substitution(double[] f1x, double k){
		double out = 0;
		for(int i = f1x.length-1; i >= 0; i--){
			double b = f1x[i];
			for(int j = 0; j < i; j++){
				b = b*k;
			}
			out += b;
		}
		return out;
	}
	//引数の配列の後ろに0があった場合消去する
	public static double[] deleteZero(double[] f2x){
		int i = 0;
		for(int j = f2x.length-1; j >= 0; j--){
			if(f2x[j] != 0)
				break;
			i++;
		}
		if(f2x.length == i)
			return new double[]{0};
		else{
			double[] out = new double[f2x.length-i];
			for(int j = 0; j < out.length; j++){
				out[j] = f2x[j];
			}
			return out;
		}
	}
	//引数の数式を微分した式を返す
	public static double[] differential(double[] f2x){
		double[] f2x2 = new double[f2x.length-1];
		for(int j = f2x.length-1; j > 0; j--){
			f2x2[j-1] = f2x[j]*j;
		}
		return f2x2;
	}
	//引数の配列を数式として出力する
	public static void printPolynomial(double[] f1x){
		String out = null;
		for(int i = f1x.length-1; i >= 0; i--){
			if(f1x[i] != 0){
				if(out != null){
					if(f1x[i] >= 0)
						out += " + ";
					else{
						out += " - ";
						f1x[i] = -f1x[i];
					}
					if(f1x[i] != 1)
						out += f1x[i];
					else{
						if(i == 0)
							out += f1x[i] + "";
						else
							out += "";
					}
					if(i == 1)
						out += "x";
					else if(i != 0)
						out += "x^"+i;
				}else{
					if(f1x[i] == -1)
						out = "-";
					else if(f1x[i] != 1)
						out = f1x[i] + "";
					else{
						if(i == 0)
							out = f1x[i] + "";
						else
							out = "";
					}
					if(i == 1)
						out += "x";
					else if(i != 0)
						out += "x^"+i;
				}
			}
		}
		if(out == null)
			System.out.println(0.0);
		else
			System.out.println(out);
	}
}