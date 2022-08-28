package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Burst_Balloons {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution1(arr));
    }

    public static int solution1(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int[][] dp = new int[arr.length][arr.length];
        for (int gap = 0; gap < arr.length; gap++) {
            int si = 0, ei = gap;
            while (ei < arr.length) {
                for (int k = si; k <= ei; k++) {
                    int leftVal = 1;
                    int rightVal = 1;
                    if (si != 0) {
                        leftVal = arr[si - 1];
                    }
                    if (ei != arr.length - 1) {
                        rightVal = arr[ei + 1];
                    }

                    int before = 0;
                    int after = 0;
                    if (si != k) {
                        before = dp[si][k - 1];
                    }
                    if (ei != k) {
                        after = dp[k + 1][ei];
                    }

                    dp[si][ei] = Math.max(dp[si][ei], before + after + (leftVal * rightVal * arr[k]));
                }
                si++;
                ei++;
            }

        }
        return dp[0][arr.length - 1];
    }
}


//    public static int solution(int arr[]){
//        int dp[][] = new int[arr.length] [arr.length];
//        for(int g=0;g<dp.length;g++){
//            for(int i=0; j=g; j<dp.length;i++,j++){
//                int max= Integer,MIN_VALUE;
//                for(int k=i; k<=j; k++){
//                    int left = k==i? 0: dp[i][k-1];
//                    int right = k==i? 0: dp[k+1][j];
//                    int val = (i==0? 1: arr[i-1])* arr[k]*(j==arr.length-1? 1: arr[j+1]);
//                    int total = left+ right+val;
//                    if(total>max){
//                        max=total;
//                    }
//                }
//
//                dp[i][j]=max;
//            }
//
//        }
//
//
//        return dp[0] [dp.length-1];
//    }
//
//
//
