package Bit_Manipulation;
import java.util.*;
public class Xor_Queries_Of_A_Subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i) arr[i]=scn.nextInt();
        int k=scn.nextInt();
        int [][]queries=new int[k][2];
        for(int i=0;i<k;++i) {
            queries[i][0]=scn.nextInt();
            queries[i][1]=scn.nextInt();
        }
        int []ans=xorQueries(arr,queries);
        for(int ele:ans) System.out.print(ele+" ");
        System.out.println();

    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int []ans=new int[queries.length];
        int k=0;
        int []xor=new int[arr.length];
        xor[0]=arr[0];
        for(int i=1;i<arr.length;++i) xor[i]=arr[i]^xor[i-1];
        for(int []q:queries)
        {
            int a=q[0];
            int b=q[1];
            int left=a==0?0:xor[a-1];
            int right=xor[b];
            ans[k++]=left^right;
        }
        return ans;
    }

}
