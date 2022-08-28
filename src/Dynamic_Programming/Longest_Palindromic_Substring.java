package Dynamic_Programming;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System .in);
        String s= sc.nextLine();

        boolean  [][] dp= new boolean [s.length()][s.length()];
        int len =0;
        for(int g=0; g<s.length();g++){
            for(int i=0,j=g; j<dp.length; i++,j++){
                if(g==0){
                    dp[i][j]= true;
                }
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]= true;
                    }
                    else{
                        dp[i][j]= false;
                    }

                }
                else{
                    if(s.charAt(i)==s.charAt(j)&& dp[i+1][j-1]== true){
                        dp[i][j]=true;
                    }
                    else {
                        dp[i][j]= false;
                    }
                }if(dp[i][j]){
                     len =g+1;
                }
            }
        }
        System.out.println(len);
    }
}
