package CompanyTest;

public class Subsets_with_XOR_value {
    class Solution{
        static int subsetXOR(int arr[], int N, int K) {
            // code here
            int res= arr[0];
            for(int i=1; i<N;i++) if(arr[i]>res)
                res=arr[i];

            int p=(1<<(int)(Math.log(res)/Math.log(2)+1))-1;
            if(K>p) return 0;

            int dp[][] = new int[N+1][p+1];
            for(int i=0; i<=N;i++)
                for(int j=0; j<=p;j++)dp[i][j]=0;
            dp[0][0]=1;

            for(int i=1; i<=N;i++)
                for(int j=0; j<=p; j++)dp[i][j]=dp[i-1][j] + dp[i-1] [j^arr[i-1]];

            return dp[N][K];

        }
    }
}
