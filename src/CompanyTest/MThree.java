package CompanyTest;
import java.io.*;
import java.util.*;
public class MThree {
    static int N;
         static int[][]maze;
         public static int SolveMaze(){
            int  res =0;
            int k=0;
            for(int i=0; i<N;i++){
                for(int j=k;j<N;j++){
                    if(i<N-1 && maze[i+1][j]==0 || i== N-1){
                        res+=maze[i][j];
                    }
                    else{
                        res+=maze[i][j];
                        k=j;
                        break;
                    }
                }
            }
            return res;
        }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            N=sc.nextInt();
            maze=new int[N][N];
            for(int i=0; i<N; i++)
                for(int j=0; j<N; j++)
                    maze[i][j]=sc.nextInt();
            System.out.println(SolveMaze());
        }
    }


