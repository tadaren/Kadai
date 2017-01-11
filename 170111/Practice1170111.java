import java.util.Scanner;

public class Practice1170111 {

	public static void main(String[] args) {
		Scanner scStr = new Scanner("Pen-Pineapple-Apple");
		scStr.useDelimiter("-");
		System.out.println("Pen-Pineapple-Apple");
		System.out.println("分離");
		for(int i = 0; i < 3; i++){
			System.out.println(scStr.next());
		}
		scStr.close();
	}

}
