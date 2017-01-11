import java.util.Scanner;

public class Practice3170111__ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String input = stdIn.nextLine();
		stdIn.close();
		int[] nums = new int[10];
		for(int i = 0; i < input.length(); i++){
			switch(input.charAt(i)){
			case '0': nums[0]++; break;
			case '1': nums[1]++; break;
			case '2': nums[2]++; break;
			case '3': nums[3]++; break;
			case '4': nums[4]++; break;
			case '5': nums[5]++; break;
			case '6': nums[6]++; break;
			case '7': nums[7]++; break;
			case '8': nums[8]++; break;
			case '9': nums[9]++; break;
			}
		}
		for(int i = 0; i < nums.length; i++){
			System.out.println(i+":"+nums[i]+"個");
		}
	}

}
