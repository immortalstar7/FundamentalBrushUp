  
import java.io.*;
public class Fizzbuzz 
  {
	public static void main(String[] args)	
	{
	String chart =  "chart", boost = "boost"; //initialize the string variables
	for (int i = 1; i <= 500; i++)
	{
	if (i % 15 == 0) //check if number in position i is divisible by 15, 
		//if so don't check other 2 conditions - we don't want a double print
	{
	  System.out.println(chart + boost + " " + i);
	}
	else if (i % 3  == 0 )
	{
	  System.out.println(chart + " " + i);
	}
	else if (i % 5== 0)
	{
	  System.out.println(boost + " "+ i);
	}
	}
	}
  }