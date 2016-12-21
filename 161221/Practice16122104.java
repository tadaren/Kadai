import java.util.Scanner;

public class Practice16122104{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[][] sports = new int[stdIn.nextInt()][2];
        int[] judge = new int[stdIn.nextInt()];
        for(int i = 0; i < sports.length; i++){
            sports[i][0] = stdIn.nextInt();
        }
        for(int i = 0; i < judge.length; i++){
            judge[i] = stdIn.nextInt();
        }
        
        for(int border : judge){
            for(int[] sport : sports){
                if(border >= sport[0]){
                    sport[1]++;
                    break;
                }
            }
        }
        int max = 0;
        int s = 0;
        for(int i = 0; i < sports.length; i++){
            if(max < sports[i][1]){
                max = sports[i][1];
                s = i;
            }
        }
        System.out.println(s+1);
    }
}