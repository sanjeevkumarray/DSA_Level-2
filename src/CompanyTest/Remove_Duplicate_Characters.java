package CompanyTest;


//   write a java program to remove duplicate characters from a string.
//   e.g. if the input is: abcdefabghib then the output should be:
//   abcdefghi sample input e abcdefabghib sample output abcdefghi


import java.io.*;
import java.util.*;
public class Remove_Duplicate_Characters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        removeDuplicates(str);
    }
     static void removeDuplicates(String str){
         LinkedHashSet<Character> set = new LinkedHashSet<>();
         for(int i=0; i<str.length();i++)
              set.add(str.charAt(i));

             for(Character ch:set)
                  System.out.print(ch);
         }

        }



