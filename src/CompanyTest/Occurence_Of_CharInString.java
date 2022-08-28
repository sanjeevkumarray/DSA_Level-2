package CompanyTest;
import java.io.*;
import java.util.*;

//Print the first occurrence of the character and count of repeated character by ignoring the case in the given string.
//
//Example input1:
//AgReEmEnT
//
//Example output1:
//A1g1R1e3m1n1T1

public class Occurence_Of_CharInString {
    static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.print(entry.getKey()+ ""+ entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        characterCount(s);
    }
}
