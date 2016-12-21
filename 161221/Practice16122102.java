import java.util.Scanner;

public class Practice16122102{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[] input = new int[stdIn.nextInt];
        for(int i = 0; i < input.length; i++){
            input[i] = stdIn.nextInt();
        }
        int evenSum = 0;
        int evenCount = 0;
        int oddSum = 0;
        int oddCount = 0;
        for(int element : input){
            if(element%2 == 0){
                evenSum += element;
                evenCount++;
            }else{
                oddSum += element;
                oddCount++;
            }
        }
        System.out.println("evenTotal : "+evenSum+" evenAverage : "+(evenSum/evenCount));
        System.out.println("oddTotal : "+oddSum+" oddAverage : "+(oddSum/oddCount));
    }
}