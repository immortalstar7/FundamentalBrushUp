package nonstring;

public class LargestInteger {

    public static void main(String[] args){
        
        //Scanner   sc = new Scanner(System.in);
        System.out.println("Please Enter"); 
            //int input = sc.nextInt();
            int[] arr = {5,4,3,232,56,7,8,9,0,6,232,232};
            int max = compareMax(arr);
            System.out.println("Max is :" +""+max);
            
    }
    
    public static int compareMax(int [] arr){
        
        int curMax,i;
        int n =arr.length;
        if(n<0)
            return -1;
        curMax = arr[0];
        
        for(i=0;i<n;i++){
            
            if(arr[i]>curMax){
                
                curMax= arr[i];
                
            }
        }
            return curMax;
        
        }
        
        
        
        
    }

