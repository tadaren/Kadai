import java.util.Scanner;

public class Kadai16111602_ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("漢文入力：");
		String line = stdIn.nextLine();
		stdIn.close();
		
		StringBuffer buffer = null;
		StringBuffer out = new StringBuffer(line.length());
		
		for(int i = 0; i < line.length()-1; i++){
			if(line.charAt(i+1) == 'レ'){
				if(buffer == null){
					buffer = new StringBuffer();
				}
				buffer.insert(0, line.charAt(i));
				i++;
			}else{
				out.append(line.charAt(i));
				if(buffer != null){
					out.append(buffer);
					buffer = null;
				}
			}
		}
		out.append(line.charAt(line.length()-1));
		if(buffer != null){
			out.append(buffer);
			buffer = null;
		}
		
		System.out.print("書き下し文：");
        System.out.print(out.toString());
	}
}
