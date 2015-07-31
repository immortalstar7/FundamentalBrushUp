import java.io.IOException;
import java.util.Arrays; 

public class RearrangeNumbers { 

public static void rearrange(int[] arr){ 
int[] counts = { 0, 0, 0 }; // set limit for number of different integers you want to sort
for (int i : arr) { 
++counts[i]; 
} 
int index = 0; 
for (int i = 0; i < counts.length; ++i) { 
while (counts[i]-- > 0) { 
arr[index++] = i; 
} 
} 
} 

public static void main(String[] args) throws IOException,IndexOutOfBoundsException{ 
int[] arr = { 0, 1, 2, 1, 0, 2, 1, 2, 0, 1, 1 ,2,2,2,0,0,0,1,2,0,2,1,2,0};	
System.out.println(Arrays.toString(arr)); 
rearrange(arr);
System.out.println(Arrays.toString(arr)); 
} 
}
