package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Numeric_Keypad {
        public static int solution(int n) {
            //write your code here
            int [][] dp= new int[n+1][10];
            int [][] data = {
                    {0,8},
                    {1,2,4},
                    {1,2,3,5},
                    {2,3,6},
                    {1,4,5,7},
                    {2,4,5,6,8},
                    {3,5,6,9},
                    {4,7,8},
                    {5,7,8,9,0},
                    {6,8,9}

            };
// ArrayList<Integer>[] data= new ArrayList[10];
// data[0]=new ArrayList(Arrays.asList({0,8}));
// data[1]= new ArrayList(Arrays.asList({1,2,4}));
// data[2]= new ArrayList(Arrays.asList({1,2,3,5}));
// data[3]= new ArrayList(Arrays.asList({2,3,6}));
// data[4]= new ArrayList(Arrays.asList({1,4,5,7}));
// data[5]= new ArrayList(Arrays.asList({2,4,5,6,8}));
// data[6]= new ArrayList(Arrays.asList({3,5,6,9}));
// data[7]= new ArrayList(Arrays.asList({4,7,8}));
// data[8]= new ArrayList(Arrays.asList({5,7,8,9,0}));
// data[9]= new ArrayList(Arrays.asList({6,8,9}));

            for(int i=1; i<=n;i++){
                for(int j=0; j<=9;j++){
                    if(i==1){
                        dp[i][j]=1;
                    }
                    else{
                        // ith press for jth key -> i - 1th press should of keys in data[j]
                        for(int prev:data[j])
                            dp[i][j]+=dp[i-1][prev];

                    }
                }

            }

        int sum =0;
      for(int j=0; j<=9; j++){
            sum+=dp[n][j];
        }
   return sum;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(solution(scn.nextInt()));
    }

}

