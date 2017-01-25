import java.util.Random;
import java.util.Scanner;

public class Kadai2170125 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] com = new int[4];
		while(com[0] == 0){
			com[0] = rand.nextInt(10);
		}
		for(int i = 1; i < com.length; i++){
			com[i] = rand.nextInt(10);
			for(int j = 0; j < i; j++){
				if(com[i] == com[j]){
					i--;
					break;
				}
			}
		}
		System.out.println("コンピュータ\t:"+com[0]+com[1]+com[2]+com[3]);
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("プレイヤ\t:");
		String input = stdIn.nextLine();
		stdIn.close();
		int[] player = new int[4];
		for(int i = 0; i < input.length(); i++){
			player[i] = Character.getNumericValue(input.charAt(i));
		}
		
		//判定
		int hit = 0;
		int blow = 0;
		for(int i = 0; i < player.length; i++){
			for(int j = 0; j < com.length; j++){
				if(player[i] == com[j]){
					if(i == j){
						hit++;
					}else{
						blow++;
					}
				}
			}
		}
		
		System.out.println("判定\t:"+hit+"Hit "+blow+"Blow");
		
	}
}
