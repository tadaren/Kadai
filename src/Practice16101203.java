import java.util.Scanner;

public class Practice16101203 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int time;
		double weight;
		for(;;){
			System.out.print("���s����(��):");
			time = stdIn.nextInt();
			System.out.print("�̏d(kg):");
			weight = stdIn.nextDouble();
			
			if(time > 0 || weight > 0){
				break;
			}
			System.out.println("���l���s�K�؂Ȃ̂ōē��͂��Ă��������B");
		}
		
		double cal = 3.0*time/60.0*weight;
		System.out.printf("����J�����[(kcal)%.2f:",cal);
		
		stdIn.close();
	}

}
