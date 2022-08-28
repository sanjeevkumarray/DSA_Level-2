package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Count_Distinct_Palindromic_Subsequences {
    public static int solution(String str) {
        // write your code here
        int [][] dp= new int[str.length()] [str.length()];
        int  [] prev = new int[str.length()];
        HashMap<Character,Integer>mp= new HashMap<>();
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(mp.containsKey(ch) ==false){
                prev[i]=-1;
            }
            else{
                prev[i]=mp.get(ch);
            }
            mp.put(ch,i);
        }
        int next[] = new int [str.length()];
        mp.clear();
        for(int i=str.length()-1; i>=0;i--){
            char ch= str.charAt(i);
            if(mp.containsKey(ch) ==false){
                next[i]=-1;
            }
            else{
                next[i]=mp.get(ch);
            }
            mp.put(ch,i);
        }
        for(int g=0; g<str.length();g++){
            for(int i=0, j=g; j<str.length(); i++, j++){
                if(g==0){
                    dp[i][j]=1;
                }
                else if (g==1){
                    dp[i][j]=2;
                }
                else {
                    char  sc= str.charAt(i);
                    char   ec= str.charAt(j);

                    if(sc!=ec){
                        dp[i][j]= dp[i+1][j] +dp[i][j-1]-dp[i+1] [j-1];
                    }
                    else{
                        int n = next[i];
                        int p = prev[j];

                        if(n>p){
                            dp[i][j]=2*dp[i+1][j-1]+2;
                        }
                        else if (n==p){
                            dp[i][j]= 2*dp[i+1][j-1]+1;
                        }
                        else{
                            dp[i][j] =2*dp[i+1][j-1]-dp[n+1][p-1];
                        }
                    }
                }
            }
        }
        return dp[0][str.length()-1];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }

}
