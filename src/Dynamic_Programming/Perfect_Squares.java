package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Perfect_Squares {
    public static int solution(int n){
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = i; //As every number can be expressed as (1*1)+(1*1)....
            for(int j = 1; j * j <= i; j++){
                int squareVal = j*j;
                if(squareVal > i){
                    break;
                }else{
                    dp[i] = Math.min(dp[i], 1 + dp[i - squareVal]);
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
    }
}


//

//    public int numSquares(int n) {
//        int dp[] =new int [n+1];
//        dp[0]=0;
//        dp[1]=1;
//        for(int i=2; i<=n; i++){
//            int min=Integer.MAX_VALUE;
//            for(int j=1; j*j<=i; j++){
//                int rem= i-j*j;
//                if(dp[rem]<min){
//                    min=dp[rem];
//                }
//            }
//            dp[i] =min+1;
//        }
//        return dp[n];
  //}
        //}
