package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Count_Number_Of_Binary_Search_Trees_With_N_Nodes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[]= new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            int l=0;
            int r=i-1;
            while(l<=i-1){
                dp[i]+=dp[l]*dp[r];
                l++;
                r--;
            }
        }
        System.out.println(dp[n]);
    }
}

