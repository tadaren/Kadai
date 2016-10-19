import java.util.Scanner;

public class Practice16101901 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("１つ目の数字：");
		int first = stdIn.nextInt();
		System.out.print("２つ目の数字：");
		int second = stdIn.nextInt();
		System.out.print("３つ目の数字：");
		int third = stdIn.nextInt();
		
		int Sum = first+second+third;
		int Num = 3;
		
		/*
		System.out.println("合計 "+Sum+" 平均 "+Sum/Num);
		System.out.println("合計 "+Sum+" 平均 "+(double)Sum/Num);
		System.out.println("合計 "+Sum+" 平均 "+Sum/(double)Num);
		System.out.println("合計 "+Sum+" 平均 "+(double)(Sum/Num));
		System.out.println("合計 "+Sum+" 平均 "+Sum/(double)Num);
		*/
		System.out.printf("合計  %d 平均 %06.2f", Sum,(double)Sum/Num);

		stdIn.close();
	}

}
