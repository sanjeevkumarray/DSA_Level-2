package CompanyTest;

public class Longest_Path_In_A_Matrix {

    class Solution
    {
        // public static int n = 3;
        private int longestIncreasingPath(int[][] matrix, int i, int j, int prev, int[][] dp) {
            if(i<0 || j<0 || i>matrix.length - 1 || j>matrix[0].length-1)
                return 0;
            if(matrix[i][j] <= prev) return 0;
            if(dp[i][j]!=0) return dp[i][j];
            int leftCell = 1 + longestIncreasingPath(matrix, i, j-1, matrix[i][j], dp);
            int rightCell = 1 + longestIncreasingPath(matrix, i, j+1, matrix[i][j], dp);
            int topCell = 1 + longestIncreasingPath(matrix, i-1, j, matrix[i][j], dp);
            int bottomCell = 1 + longestIncreasingPath(matrix, i+1, j, matrix[i][j], dp);
            return dp[i][j] = Math.max(leftCell, Math.max(rightCell, Math.max(topCell, bottomCell)));
        }
        public int longestIncreasingPath(int[][] matrix){
            int ans = 0;
            int[][] dp = new int[matrix.length][matrix[0].length];
            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix[0].length; j++) {
                    int min=Integer.MIN_VALUE;
                    ans = Math.max(longestIncreasingPath(matrix, i, j, min, dp), ans);
                }
            }
            return ans;

        }
    }
}
