package stringManipulation;
import java.util.*;

public class RemoveDuplicateString {



    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter"); 
        String input = sc.nextLine();
    //  String result = removeDuplicate(input);
        String resultBySet = removeDuplicateBySet(input);
        System.out.println("Unique:" + resultBySet);
        //System.out.println("Duplicate-less is "+ result);     
    }


public static String removeDuplicate(String str){
    
    
    boolean [] repeat = new boolean[256];
    int len = str.length();
    StringBuilder sb = new StringBuilder(repeat.length);
    
    for(int i =0;i<len;i++){
        
        char ch = str.charAt(i);
        if(!repeat[ch]){
            
            repeat[ch] = true;
            sb.append(ch);  
        }
        
    }
    return sb.toString();
    
    
    
}
public static String removeDuplicateBySet(String str){
    
            StringBuilder sb = new StringBuilder();
            Set<Character> repeat = new HashSet<Character>();
            int len = str.length();
            for(int i=0;i<len;i++){
                char ch = str.charAt(i);
                if(!repeat.contains(ch)){
                    
                    repeat.add(ch);
                    sb.append(ch);
                }
                
                
            }
            
            return sb.toString();


   }
}


