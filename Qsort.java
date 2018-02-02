import java.util.Scanner;
//クイックソート
public class Qsort{
	// クイックソート//
	static void QsortMethod(int[] a, int left, int right) {
		if(left < right){
			int pivot = partition(a, left, right);
			QsortMethod(a, left, pivot-1);
			QsortMethod(a, pivot+1, right);
		}
	}
	static int partition(int[] a, int left, int right){
		if(left+1 == right){
			if(a[left]>a[right]){
				swap(a, left, right);
			}
			return right;
		}
		int pivot = pivot(a, left, right);
		swap(a, pivot, right);
		int i = left;
		int j = right-1;
		while(i < j){
			while(i < right && a[i] <= a[right]){
				i++;
			}
			while(i<=j && a[j] > a[right]){
				j--;
			}
			if(i < j){
				swap(a, i, j);
			}
		}
		swap(a, i, right);
		return i;
	}
	static int pivot(int[] a, int left, int right){
		int center = (left+right)/2;
		if(a[left] >= a[center]){
    		if(a[center] >= a[right]){
    			return center;
    		}else if(a[left] <= a[right]){
    			return left;
    		}else {
    			return right;
    		}
    	}else if(a[left] > a[right]) {
    		return left;
    	}else if(a[center] < a[right]){
    		return center;
    	}else{
    		return right;
    	}
	}
	static void swap(int[] a, int i, int j){
		int buf = a[i];
		a[i] = a[j];
		a[j] = buf;
	}
	
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		//要素数、値はキーボードから入力
		System.out.println("クイックソート");
		System.out.print("要素数：");
		int arrayNum= stdIn.nextInt();
		int[] x = new int[arrayNum];
		//入力
		for (int i= 0; i< arrayNum; i++) {
			System.out.print("x[" + i+ "]：");
			x[i] = stdIn.nextInt();
		}
		stdIn.close();
		QsortMethod(x, 0, arrayNum-1); // クイックソート
		System.out.printf("昇順にソート\n");
		for (int i= 0; i< arrayNum; i++)System.out.printf("x[%d]=%d",i,x[i]);
	}
}
