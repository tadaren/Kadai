import java.util.Scanner;

public class SortArug {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("いくつの要素をソートしますか:");
    int[] array = new int[stdIn.nextInt()];
    for(int i = 0; i < array.length; i++){
      System.out.print("array["+i+"]:");
      array[i] = stdIn.nextInt();
    }
    int[] a =  bucketSort(array);
    for(int element : a){
      System.out.println(element);
    }

  }

  public static int[] bucketSort(int[] array){
    int max = array[0];
    int min = array[0];
    for(int i = 0; i < array.length; i++){
      if(max < array[i]){
        max = array[i];
      }
      if(min > array[i]){
        min = array[i];
      }
    }
    int shift = 0;
    if(min < 0){
      shift = min*(-1);
    }
    int[] bucket = new int[max+shift+1];
    for(int i = 0; i < array.length; i++){
      bucket[array[i]+shift]++;
    }
    int[] after = new int[array.length];
    for(int i = 0, k = 0; i < bucket.length; i++){
      for(int j = 0; j < bucket[i]; j++){
        after[k] = i-shift;
        k++;
      }
    }
    return after;
  }
}
