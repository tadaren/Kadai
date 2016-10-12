import java.util.Scanner;

public class Practice16101203 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int time;
		double weight;
		for(;;){
			System.out.print("歩行時間(分):");
			time = stdIn.nextInt();
			System.out.print("体重(kg):");
			weight = stdIn.nextDouble();
			
			if(time > 0 || weight > 0){
				break;
			}
			System.out.println("数値が不適切なので再入力してください。");
		}
		
		double cal = 3.0*time/60.0*weight;
		System.out.printf("消費カロリー(kcal)%.2f:",cal);
		
		stdIn.close();
	}

}
