import java.util.Scanner;

public class Practice2170111 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("日付入力:");
		String input = stdIn.nextLine();
		stdIn.close();
		String[] date = input.split("\\.");
		
		int year = (Integer.parseInt(date[0])+12)%100;
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		
		System.out.println("平成"+year+"年"+month+"月"+day+"日");
	}
}
