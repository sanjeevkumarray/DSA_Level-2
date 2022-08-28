package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Distinct_Transformations {
    public static int solution(String s, String t, int si, int ti){
          if(si==s.length()) {
              if (ti < t.length()) {
                  return 0;
              } else {
                  return 1;
              }
          }
          else if(ti==t.length()){
                return 1;
          }

          char ch1= s.charAt(si);
          char ch2= t.charAt(ti);
          int tw= 0;
           if(ch1!=ch2){
                tw= solution(s,t,si+1,ti);
           }else{
               int tw1 =solution(s,t, si+1,ti);
               int tw2=solution(s,t,si+1,ti+1);
                tw= tw1+tw2;
           }
            return tw;
}


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(solution(s1, s2, 0, 0));
    }

}


// using dp

//import java.io.*;
//import java.util.*;
//
//public class Main {
//
//    public static int solution(String s, String t ){
//        int[][] dp= new int[t.length()+1][s.length()+1];
//        for(int i=dp.length-1; i>=0; i--){
//            for(int j=dp[0].length-1; j>=0; j--){
//                if(i==dp.length-1){
//                    dp[i][j]=1;
//                }
//                else if(j==dp[0].length-1){
//                    dp[i][j]=0;
//                }
//                else{
//                    char ch1= t.charAt(i);
//                    char ch2= s.charAt(j);
//
//                    if(ch1!=ch2){
//                        dp[i][j]= dp[i][j+1];
//                    }
//                    else{
//                        dp[i][j]= dp[i][j+1]+ dp[i+1][j+1];
//                    }
//                }
//            }
//        }
//        return dp[0][0];
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String s1 = scn.next();
//        String s2 = scn.next();
//        System.out.println(solution(s1, s2));
//    }
//}