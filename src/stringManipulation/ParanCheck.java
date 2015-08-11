package stringManipulation;
import java.io.*;
public class ParanCheck {

    public static void main(String[] args) {
//take a test string to check the formation validity of the braces
        String s = FilterBrackets("(a+{b+c}-[d-e])[][]");
      

        while ((s.length()!=0) && (s.contains("[]")||s.contains("()")||s.contains("{}")))
        {
        //System.out.println(s.length());
        //System.out.println(s);
        s = s.replace("[]", "");
        s = s.replace("()", "");
        s = s.replace("{}", "");
        }

        if(s.length()==0)
        {
            System.out.println("Valid formation");
        }
        else
        {
            System.out.println("Invalid Formation");
        }
    }

    public static String FilterBrackets(String str)
    {
        int len=str.length();
        char arr[] = str.toCharArray();
        String filter = "";
        for (int i = 0; i < len; i++)
        {
            if ((arr[i]=='(') || (arr[i]==')') || (arr[i]=='[') || (arr[i]==']') || (arr[i]=='{') || (arr[i]=='}'))
            {
                filter=filter+arr[i];
            }
        }
        return filter;
    }

}