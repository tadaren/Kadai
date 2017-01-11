import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kadai1170111_ {

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
			Pattern pName = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
			while((line=br.readLine())!=null){
				Matcher mName = pName.matcher(line);
				while(mName.find()){
					count++;
				}
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(count+"個見つかりました");
	}

}
