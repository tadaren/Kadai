import java.util.Scanner;

public class Practice16122103{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[][] input = new int[stdIn.nextInt()][3];
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[i].length; j++){
                input[i][j] = stdIn.nextInt();
            }
        }
        int[] player = new int[input.length];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < input.length; j++){
                boolean check = true;
                for(int k = 0; k < input.length; k++){
                    if(j != k){
                        if(input[j][i] == input[k][i]){
                            check = false;
                            break;
                        }
                    }
                }
                if(check){
                    player[j] += input[j][i];
                }
            }
        }
        for(int element : player){
            System.out.println(element);
        }
    }
}