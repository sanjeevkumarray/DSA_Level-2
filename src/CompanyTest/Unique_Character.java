package CompanyTest;
import java.io.*;
import java.util.*;
public class Unique_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.print(cntDistinct(str));
    }
         public static int cntDistinct(String  str){
            HashSet<Character> s = new HashSet<Character>();
            for(int i = 0; i < str.length(); i++) {
                s.add(str.charAt(i));
            }
            return s.size();
        }
        }

        //input :
        //7
//abcdabc
//  o/p
//4

//input: 8
  //efeefhjg
//  o/p
     //5



