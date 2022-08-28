package Recursion_And_Backtracking;
import java.io.*;
import java.util.*;
public class Print_Abbreviations {
    public static void solution(String str, String asf, int count, int pos) {
        if (pos == str.length()) {
            if (count == 0) {
                System.out.println(asf);
            } else {
                System.out.println(asf + count);
            }
            return;
        }


        if (count > 0)
            solution(str, asf + count + str.charAt(pos), 0, pos + 1);
           else
            solution(str, asf + str.charAt(pos), 0, pos + 1);
            solution(str, asf, count + 1, pos + 1);
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            solution(str, " ", 0, 0);
        }
    }


    //input : pep
