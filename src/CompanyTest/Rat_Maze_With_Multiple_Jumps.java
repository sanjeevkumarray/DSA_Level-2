package CompanyTest;

public class Rat_Maze_With_Multiple_Jumps {
    class Solution{
        boolean isSafe(int x, int y, int [][] matrix){
            int n = matrix.length;
            return (x >= 0 && x < n && y >=0 && y < n && matrix[x][y] != 0);
        }

        boolean generate(int x, int y, int [][] matrix, int [][] sol){
            int n = matrix.length;
            if(x == n-1 && y == n-1){
                sol[x][y] = 1;
                return true;
            }
            if(isSafe(x, y, matrix)){
                sol[x][y] = 1;
                for(int step = 1; step <= matrix[x][y] && step < n; step++){
                    if(generate(x, y+step, matrix, sol))
                        return true;
                    if(generate(x+step, y, matrix, sol))
                        return true;
                }
                sol[x][y] = 0;
                return false;
            }
            return false;
        }
        public int[][] ShortestDistance(int[][] matrix)
        {
            int  n = matrix.length;
            int [][] sol = new int[n][n];
            generate(0, 0, matrix, sol);
            if(sol[n-1][n-1] == 0){
                int [][] ans = new int[1][1];
                ans[0][0] = -1;
                return ans;
            }
            return sol;
        }
    }
}


//Transpose Matrix


//class Solution {
//    public int[][] transpose(int[][] matrix) {
//        int row = matrix.length, col = matrix[0].length;
//        int[][] res = new int[col][row];
//        for (int i = 0; i < row; i++)
//            for (int j = 0; j < col; j++) {
//                res[j][i] = matrix[i][j];
//            }
//        return  res;
//    }
//}
