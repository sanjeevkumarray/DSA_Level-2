package Graph;

public class Swim_In_Rising_Water {
}
//    public int swimInWater(int[][] grid) {
//        int n= grid.length;
//        PriorityQueue<Pair> pq= new PriorityQueue<>();
//        boolean[][] vis = new boolean[n][n];
//        int[][] dirs ={{0,1},{1,0},{-1,0},{0-1}};
//        while(pq.size()>0){
//            Pair rem = pq.remove();
//            return rem.msf;
//        }
//        if(vis[rem.row][rem.col]==true){
//            continue;
//        }
//        vis[rem.row][rem.col]=true;
//        for(int i=0; i<4; i++){
//            int rowdash =rem.row+dirs[i][0];
//            int coldash = rem.col+dirs[i][1];
//            if(rowdash<0 || coldash <0 || rowdash>= n|| coldash>=n ||vis[rowdash][coldash]==true){
//                continue;
//            }
//            pq.add(new Pair(rowdash,coldash,Math.max(rem.msf,grid[rowdash][coldash])));
//        }
//    }
//return 0;
//        }
//
//
//public class Pair implements Comparable<Pair>{
//    int row;
//    int col;
//    int msf;
//    Pair(int row, int col, int msf){
//        this.row= row;
//        this.col=col;
//        this.msf= msf;
//
//    }
//    @overide
//    public int compareTo(Pair o){
//        return this.msf-o.msf;
//    }
//}
//}



/// second way
//class Solution {
//    public class Pair implements Comparable<Pair>{
//        int i;
//        int j;
//        int wt;
//        Pair(int i, int j, int wt){
//            this.i = i;
//            this.j = j;
//            this.wt = wt;
//        }
//        public int compareTo(Pair o){
//            return this.wt - o.wt;
//        }
//    }
//
//    public int swimInWater(int[][] grid) {
//        boolean[][] vis = new boolean[grid.length][grid[0].length];
//        PriorityQueue<Pair> pq = new PriorityQueue<>();
//        pq.add(new Pair(0, 0, grid[0][0]));
//        int ans = 0;
//        while(pq.size() > 0){
//            Pair rem = pq.remove();
//            if(vis[rem.i][rem.j])
//                continue;
//            vis[rem.i][rem.j] = true;
//            if(rem.wt > ans)
//                ans = rem.wt;
//            if(rem.i == grid.length - 1 && rem.j == grid[0].length - 1)
//                return ans;
//            if(rem.i - 1 >= 0)
//                pq.add(new Pair(rem.i - 1, rem.j, grid[rem.i - 1][rem.j]));
//            if(rem.i + 1 < grid.length)
//                pq.add(new Pair(rem.i + 1, rem.j, grid[rem.i + 1][rem.j]));
//            if(rem.j - 1 >= 0)
//                pq.add(new Pair(rem.i, rem.j - 1, grid[rem.i][rem.j - 1]));
//            if(rem.j + 1 < grid[0].length)
//                pq.add(new Pair(rem.i, rem.j + 1, grid[rem.i][rem.j + 1]));
//        }
//        return ans;
//    }
//}