import java.util.Scanner;

public class Practice1170125 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("2つの数を入力してください");
		System.out.print("x:");
		int x = stdIn.nextInt();
		System.out.print("y:");
		int y = stdIn.nextInt();
		stdIn.close();
		
		if(x < y){
			int i = x;
			x = y;
			y = i;
		}
		
		int ans;
		while(true){
			int result = x % y;
			if(result == 0){
				ans = y;
				break;
			}else{
				x = y;
				y = result;
			}
		}
		System.out.println("最大公約数->"+ans);
	}

}
