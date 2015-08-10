
public class Collabedit {

}
/*

Second highest number:
Input: [2, 6, 9, 15, 4]
Output: 9

public static main(String[] args){

        
        int[] input ={2,6,9,15,4};
        int max =input[0];
        int secondMax =input[0];
        int len= input.length;
        
        if(len<=1){
        
        return;
        
        }
        for(int i=0;i<len;i++){
        
        if(input[i]>max){
        
             secondMax = max;
             max = input[i];
            
        }else (input[i]>secondMax){
        
        
            secondMax=input[i];
        }
        
        
        }
        
        System.out.println("Second Largest Number would be: " + secondMax);


}



Palindrome:
Input: abba
Output: true

Input: abbbc
Output: false


public static void myPalindrome(String str){


            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the string:");
            
            str= sc.nextLine();
            int len = str.length();
            
            String palin ="";
            
            
            for(int i= len-1;i>=0;i--)
            {
            
            
                    palin = palin + str.charAt(i);
  
            }
            
            
            if(str.equals(palin)){
            
             System.out.println("Entered string is palindrome");
            
            } else
            
            {
            
            
             System.out.println("Entered string is palindrome");
            }





}




Similarity:
Input:
a = [4, 5, 9, 14]
b = [4, 9, 20]

Similarity = 2/5 = 0.4
Similarity = (a intersection b) / (a union b)

simiarity = arrayIntersection/arrayUnion


public static void main(String[] args){

        int[] a = {4, 5, 9, 14};
        int[] b = {4, 9, 20};
        
        int m= arrayIntersection(a,b);
     
     
        int union = arrayUnion(a,b);
        
        int similarity = lengthintersect/ lengthunion;

}

int m = set.length/union.length;

public static void arrayIntersection(int[] a, int[] b){

                a ={4,5,9,14};
                b ={4,9,20};
                
               
               HashSet<Integer> set = new HashSet<Integer>();
                for(int i =0;i<a.length;i++){
                
                    for(int j =0; b.length;j++){
                    
                    
                    if(a[i]==b[j]){
                    
                       set.add(a[i]);
                    }
                    
                    }
                    
                    
                    
                    
              }
                    
             } 
             
             
                   
                    
              public static void arrayUnion(int[] a, int[] b){  
              
              
                a ={4,5,9,14};
                b ={4,9,20};
                
                
              HashSet<Integer> union = new HashSet<Integer>();
              
              
              for(int i =0;i<a.length;i++){
                
                    for(int j =0; b.length;j++){
                    
                    
                    
                    
                       union.add(a[i]);
                       union.add(b[j]);
                    
                    
                    }
                    
                    
                    
              }
              
              }    







}





*/