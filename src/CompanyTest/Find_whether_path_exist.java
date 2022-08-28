package CompanyTest;

public class Find_whether_path_exist {
    class Solution
    {
        //Function to find whether a path exists from the source to destination.
        boolean flag1=false;
        public boolean is_Possible(int[][] grid){
            int start=-1,end=-1;
            boolean flag2=false;
            boolean vis[][] = new boolean[grid.length][grid.length];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++)
                {
                    if(grid[i][j]==1)
                    {
                        start=i;
                        end=j;
                        flag2=true;
                        break;
                    }
                }
            }
            if(!flag2)return false;
            path(grid,start,end,vis);
            return flag1;
        }
        void path(int [][] grid,int i,int j,boolean vis[][])
        {
            if(grid[i][j] == 2)
            {
                // System.out.print(grid[i][j]+" ");
                flag1 = true;
                return;
            }

            //UP
            if((i-1)>=0 && grid[i-1][j]!=0 && !vis[i-1][j])
            {
                vis[i][j]=true;
                //System.out.print(grid[i][j]+" ");
                path(grid,i-1,j,vis);
                vis[i][j]=false;
            }

            //DOWN
            if((i+1)<grid.length && grid[i+1][j]!=0 && !vis[i+1][j])
            {
                vis[i][j]=true;
                // System.out.print(grid[i][j]+" ");
                path(grid,i+1,j,vis);
                vis[i][j]=false;
            }

            //LEFT
            if((j-1)>=0 && grid[i][j-1]!=0 && !vis[i][j-1])
            {
                vis[i][j]=true;
                //System.out.print(grid[i][j]+" ");
                path(grid,i,j-1,vis);
                vis[i][j]=false;
            }

            //RIGHT
            if((j+1)<grid.length && grid[i][j+1]!=0 && !vis[i][j+1])
            {
                vis[i][j]=true;
                // System.out.print(grid[i][j]+" ");
                path(grid,i,j+1,vis);
                vis[i][j]=false;
            }
        }

    }
}


//    Repeated Substring Pattern
//   class Solution {
//    public boolean repeatedSubstringPattern(String s) {
//        String str1=s+s;
//        String str2=str1.substring(1,str1.length()-1);
//        if(str2.contains(s)) return true;
//        else return false;
//    }
//}