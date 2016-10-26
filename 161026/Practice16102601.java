import java.util.Scanner;

public class Practice16102601 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("年の入力:");
		int year = stdIn.nextInt();
		int month;
		for(;;){
			System.out.print("月の入力:");
			month = stdIn.nextInt();
			if(0 < month && month < 13){
				break;
			}
			System.out.print("入力が不正です。");
		}
		System.out.print("日の入力:");
		int day = stdIn.nextInt();

		int output = 0;
		if(year%400 == 0 || (year%100 != 0 && year%4 == 0)){
			days[1] = 29;
		}
		for(int i = 0; i < month-1; i++){
			output += days[i];
		}
		output += day;

		System.out.println(output);
		stdIn.close();
	}

}
