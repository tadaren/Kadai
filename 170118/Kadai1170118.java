
public class Kadai1170118 {

	public static void main(String[] args) {
		String[] array = {
				"thyme",
				"laurel",
				"mint",
				"basil",
				"chicory",
				"rosemary",
				"coriander",
				"sage",
				"parsley",
				"oregano",
			};
		String[] after = new String[array.length];
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length-1; j++){
				if(array[j].compareToIgnoreCase(array[j+1]) > 0){
					String buffer = array[j];
					array[j] = array[j+1];
					array[j+1] = buffer;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}

}
