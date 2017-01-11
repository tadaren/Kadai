import java.util.Scanner;

public class Practice3170111 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String input = stdIn.nextLine();
		stdIn.close();
		String[] sp = input.split("");
		int[] nums = new int[10];
		for(int i = 0; i < input.length(); i++){
			if(sp[i].matches("[0-9]")){
				nums[Integer.parseInt(sp[i])]++;
			}
		}
		for(int i = 0; i < nums.length; i++){
			System.out.println(i+":"+nums[i]+"個");
		}
		
	}

}
