import java.util.Scanner;


import java.util.*;
public class WordCount {

	
	
	
public static void main(String[] args){
		
		System.out.println("\n Enter String :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = countWords(str);
		System.out.println("Count of word in string is : "+count);
			
	}
	
	
	
	public static int countWords(String str){
        if(str == null || str.isEmpty())
            return 0;

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
                while(str.charAt(i) != ' ' && i < str.length()-1){
                    i++;
                }
            }
        }
        return count;
    }
}
