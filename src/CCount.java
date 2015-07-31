
//Write a function to print character count for each 
//different characters in a given string.

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
class CCount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = sc.nextLine();
        count(s);
    }
    
    public static void count(String str){

    	int l = str.length();
    	
    	HashMap<Character, Integer> hm = new HashMap<>();
    //	HashMap<String, Double> hm2 = new HashMap<>();
    	
    	for(int i=0;i<l;i++){
    		char ch =str.charAt(i);
    		if(hm.containsKey(ch)){
    			int x = hm.get(ch);
    			x++;
    			hm.put(ch, x);
    		}else{
    			hm.put(ch, 1);
    		}
    		
    	}
    	
    	for(Entry<Character, Integer> entry : hm.entrySet()){
    		System.out.print(entry.getKey() + " " + entry.getValue() + ",");
    	}
    	
    }
}