import java.util.Arrays;

public class Scount {
	public static void main(String[] args) {
		System.out.println(count("batman is bat ia batmanbat", "car"));
	}
	
	public static int count(String s, String sub){
		int counter = 0; 
		String temp;
		char [] c = s.toCharArray();
		
		for (int i = 0; i + sub.length() <= s.length(); i++) {
			// Copies the specified range of the specified array into a new array
			//then, using string constructor, char array is converted into string
			temp = new String(Arrays.copyOfRange(c, i, i+sub.length()));
			if(temp.equals(sub))
				counter++;
		}
		return counter;
	}
}