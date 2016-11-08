import java.util.Scanner;

public class Practice1611021 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int[][] sum = new int[2][2];
		int[][] remainder = new int[2][2];
		int[][] product = new int[2][2];
		
		System.out.println("s—ña‚Ì“ü—Í");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print("a["+i+"]["+j+"]:");
				a[i][j] = stdIn.nextInt();
			}
		}
		System.out.println("s—ñb‚Ì“ü—Í");
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length; j++){
				System.out.print("b["+i+"]["+j+"]:");
				b[i][j] = stdIn.nextInt();
			}
		}
		
		//‘«‚µZ
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		//ˆø‚«Z
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				remainder[i][j] = a[i][j] - b[i][j];
			}
		}
		//Š|‚¯Z
		for(int i = 0; i < product.length; i++){
			for(int j = 0; j < product.length; j++){
				int num = 0;
				for(int k = 0;k < a.length; k++){
					num += a[i][k]*b[k][j];
				}
				product[i][j] = num;
			}
		}
		//o—Í
		System.out.println("‘«‚µZ‚ÌŒ‹‰Ê");
		for(int i = 0; i < sum.length; i++){
			for(int j = 0; j < sum[i].length; j++){
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("ˆø‚«Z‚ÌŒ‹‰Ê");
		for(int i = 0; i < remainder.length; i++){
			for(int j = 0; j < remainder[i].length; j++){
				System.out.print(remainder[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Š|‚¯Z‚ÌŒ‹‰Ê");
		for(int i = 0; i < product.length; i++){
			for(int j = 0; j < product.length; j++){
				System.out.print(product[i][j] + " ");
			}
			System.out.println();
		}
		stdIn.close();

	}

}
