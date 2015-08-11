package nonstring;
import java.io.*;
import java.util.Arrays;
public class listSort {

	public static void main(String arg[]){
		int [] arr = {0,0,0,0,2,1,2,0,2,1,2,1,2,0,1,0,1,0,2,0,1,1,1,1,2,2};
		int pointer1 = 0,pointer2 = arr.length - 1;
		for(int i = 0;i<pointer2;)
		{
			if(arr[i]==0)
			{
				if(i == pointer1)
				{
					i++;
					pointer1++;
				}else
				{
					arr[i] = arr[pointer1];
					arr[pointer1++] = 0;
				}
			}else if( arr[i] == 2 )
			{
				arr[i] = arr[pointer2];
				arr[pointer2--] = 2;
			}else
			{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
