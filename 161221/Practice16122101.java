import java.util.Scanner;

public class Practice16122101{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[] input = new int[stdIn.nextInt()];
        for(int i = 0; i < input.length; i++){
            input[i] = stdIn.nextInt();
        }
        int max = input[0];
        int min = input[0];
        for(int element : input){
            if(max < element){
                max = element;
            }
            if(min > element){
                min = element;
            }
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}