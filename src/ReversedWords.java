import java.util.Scanner;
import java.util.StringTokenizer;
 
 
public class ReversedWords
{
//execute application
public static void main( String [] args)
{
//get sentence
Scanner scanner = new Scanner ( System.in);
System.out.println ("Enter a sentence and press Enter");
String sentence = scanner.nextLine();
 
 
//process user sentence
String[] words = sentence.split (" ");
System.out.println ( " The reversed words are : ");
 
for(int x = words.length - 1; x > -1; x--){
    System.out.print(words[x] + " ");
    }
}
}