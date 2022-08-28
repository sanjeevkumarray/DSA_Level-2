package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Count_Distinct_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        long [] dp = new long[str.length() + 1];
        dp[0] = 1;
      HashMap<Character,Integer > hm= new HashMap<>();
         for(int i=1; i<dp.length;i++){
              dp[i]=2*dp[i-1];

             char ch = str.charAt(i-1);
             if(hm.containsKey(ch)){
                 int j= hm.get(ch);
                 dp[i]= dp[i]-dp[j-1];
             }
              hm.put(ch,i);
         }
         System.out.println(dp[str.length()]-1);
    }
}
