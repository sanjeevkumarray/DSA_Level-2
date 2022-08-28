package CompanyTest;
import java.io.*;
import java.util.*;
public class Test7 {
    public static void main (String[] args) throws java.lang.Exception
    {
        String  str =  "Noon" ,    rev= "";
        int  strLength= str.length();
        for(int i=(strLength-1); i>=0; i--){
            rev = rev+str.charAt(i);

        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println(str+ "  is  a Palindrome String.");
        }
        else{
            System.out.println(str+ " is a not a Palindrome String.");
        }
    }

}


