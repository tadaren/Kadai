import java.util.Scanner;

public class Practice1611022 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] subject = {"����","���w"};
		int[][] point = new int[6][2];
		
		System.out.println("�_������");
		for(int i = 0; i < point.length; i++){
			System.out.println(i+1+"�l��");
			for(int j = 0; j < point[i].length; j++){
				System.out.print(subject[j]+":");
				point[i][j] = stdIn.nextInt();
			}
		}
		
		//���Ȃ��Ƃ̕��ϓ_
		for(int i = 0; i < point[0].length; i++){
			int sum = 0;
			for(int j = 0; j < point.length; j++){
				sum += point[j][i];
			}
			System.out.printf(subject[i]+"�̕��ϓ_:%.2f\n",(double)sum/point.length);
		}
		//�w�����Ƃ̕��ϓ_
		for(int i = 0; i < point.length; i++){
			int sum = 0;
			for(int j = 0; j < point[i].length; j++){
				sum += point[i][j];
			}
			System.out.printf(i+1+"�l�ڂ̕��ϓ_:%.2f\n",(double)sum/point[i].length);
		}
		
		
		stdIn.close();
	}

}
