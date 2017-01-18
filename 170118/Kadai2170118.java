import java.util.Calendar;
import java.util.Scanner;

public class Kadai2170118 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("奈良高専クリーニング店にようこそ!!");
		Calendar cal = Calendar.getInstance();
		System.out.print("年:");
		int year = stdIn.nextInt();
		System.out.print("月:");
		int month = stdIn.nextInt();
		System.out.print("日:");
		int date = stdIn.nextInt();
		stdIn.close();
		cal.set(year, month-1, date);
		
		cal.add(Calendar.DATE, 1);
		
		System.out.println("仕上がりは、"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");
	}

}
