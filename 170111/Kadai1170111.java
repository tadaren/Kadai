import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Kadai1170111 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("ファイル名:");
		String fileName = stdIn.nextLine();
		System.out.print("検索文字列:");
		String pattern = stdIn.nextLine();
		stdIn.close();

		int count = 0;
		try{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			int index= 0;
			while((line=br.readLine())!=null){
				while(true){
					int num = line.indexOf(pattern, index);
					if(num != -1){
						count++;
						index = num+pattern.length();
					}else{
						break;
					}
				}
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(count+"個見つかりました");

	}

}
