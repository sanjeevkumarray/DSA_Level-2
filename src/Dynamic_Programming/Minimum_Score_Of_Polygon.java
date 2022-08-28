package Dynamic_Programming;
import java.util.*;
import java.io.*;
public class Minimum_Score_Of_Polygon {
    public static int minScoreTriangulation(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        for (int d = 2; d < n; ++d) {
            for (int i = 0; i + d < n; ++i) {
                int j = i + d;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; ++k)
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + arr[i] * arr[j] * arr[k]);
            }
        }
        return dp[0][n - 1];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(minScoreTriangulation(arr));
    }
}


// 1039. Minimum Score Triangulation of Polygon
//  class Solution {
//    public int minScoreTriangulation(int[] arr) {
//        int[][] dp = new int[arr.length][arr.length];
//        for (int g = 2; g < dp.length; g++) {
//            for (int i = 0, j = g; j < dp[0].length; i++, j++) {
//                if (g == 2) {
//                    dp[i][j] = arr[i] * arr[i + 1] * arr[i + 2];
//                }
//
//                else {
//                    int min = Integer.MAX_VALUE;
//                    for (int k = i + 1; k <= j - 1; k++) {
//                        int leftpart = dp[i][k];
//                        int rightpart = dp[k][j];
//                        int triangle = arr[i] * arr[j] * arr[k];
//
//                        int total = leftpart + rightpart + triangle;
//                        min=Math.min(min,total);
//                    }
//                    dp[i][j] = min;
//                }
//            }
//
//        }
//        return dp[0][dp[0].length - 1];
//    }
//}