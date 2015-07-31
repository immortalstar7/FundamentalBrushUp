/* 
Write a function that returns the number of occurrences of a string in another string.

int occurrenceCount(String mainString, String subString)

Example : occurrenceCount("Batman is not really a bat", "bat") returns 2, because "bat" shows up 2 times in the first string.

occurenceCount("Mango, Apple are two different kind of fruits", "car") returns 0.

Let me know if you have any questions. 
*/


import java.util.Scanner;

public class SubCount {

	public static void main(String[] args){
		
		System.out.println("\n Enter String :");
		Scanner sc = new Scanner(System.in);
		String mainString = sc.nextLine();
		String subString = sc.nextLine().toLowerCase();
		int count = occurenceCount(mainString,subString);
		System.out.println("Count is : "+count);
			
	}

	public static int occurenceCount(String mainString, String subString) {

	
		int s=0,count=0;
		if (subString == null || mainString == null || subString.equals("")){			
			return 0;
		}
		
		mainString = mainString.toLowerCase();
		subString = subString.toLowerCase();
		
		for(int i=0;i<mainString.length();i++){
          
			
			
			
			if(s!=subString.length() && mainString.charAt(i)==subString.charAt(s))
				s++;
			else if(s>subString.length()){
				s=0;
			}
			if(s==subString.length()){
				count++;
				s=0;
			}
			
			
		
				
		}
		//System.out.println("\n Count is : "+count);
		return count;

		
	}
}