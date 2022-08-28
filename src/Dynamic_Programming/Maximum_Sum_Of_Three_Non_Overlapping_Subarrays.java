//package Dynamic_Programming;
//import java.io.*;
//import java.util.*;
//public class Maximum_Sum_Of_Three_Non_Overlapping_Subarrays {
//        public static void main(String[] args) {
//            Scanner scn = new Scanner(System.in);
//            int n = scn.nextInt();
//            int[] arr = new int[n];
//            for(int i = 0 ; i < arr.length; i++){
//                arr[i] = scn.nextInt();
//            }
//            int k = scn.nextInt();
//            solution(arr,k);
//        }
//
//        public static void solution(int[] arr, int k){
//            if(arr == null || arr.length < 3){
//                return;
//            }
//            int n = arr.length;
//            int[] left = new int[n];
//            int[] right = new int[n];
//            int[] third = new int[n];
//
//            int lsum = 0;
//            for(int i = 0; i < k; i++){
//                lsum += arr[i];
//                if(i == k - 1){
//                    left[i] = lsum;
//                }
//            }
//            int prev = arr[0];
//            for(int i = k; i < n; i++){
//                lsum += arr[i];
//                left[i] = Math.max(left[i - 1], lsum - prev);
//                prev += arr[i - k + 1];
//            }
//
//            int rsum = 0;
//            for(int i = n - 1; i >= n - k; i--){
//                rsum += arr[i];
//                if(i == n - k){
//                    right[i] = rsum;
//                }
//            }
//            prev = arr[n - 1];
//            for(int i = n - k - 1; i >= 0; i--){
//                rsum += arr[i];
//                right[i] = Math.max(right[i + 1], rsum - prev);
//                prev += arr[i + k - 1];
//            }
//
//            rsum = 0;
//            for(int i = n - 1; i >= n - k; i--){
//                rsum += arr[i];
//                if(i == n - k){
//                    third[i] = rsum;
//                }
//            }
//            prev = arr[n - 1];
//            for(int i = n - k - 1; i >= 0; i--){
//                rsum += arr[i];
//                third[i] = rsum - prev;
//                prev += arr[i + k - 1];
//            }
//
//            int ans = 0;
//            int[] res = new int[3];
//
//            for(int i = k, j = 1; i <= n - (2*k); i++){
//                if(left[i - 1] + third[i] + right[i + k] > ans){
//                    ans = left[i - 1] + third[i] + right[i + k];
//                    res[0] = i - k;
//                    res[1] = i;
//                    res[2] = i + k;
//                }
//            }
//
//            int val = left[res[0] + k - 1];
//            for(int i = 0; i <= res[0] + k - 1; i++){
//                if(left[i] == val){
//                    res[0] = i - k + 1;
//                    break;
//                }
//            }
//
//            val = right[res[2]];
//            for(int i = res[2]; i <= n; i++){
//                if(third[i] == val){
//                    res[2] = i;
//                    break;
//                }
//            }
//
//            System.out.print(ans + " ");
//            for(int a : res){
//                System.out.print(a + " ");
//            }
//        }
//
//    }
//
import java.io.*;
import java.util.*;
public class  Maximum_Sum_Of_Three_Non_Overlapping_Subarrays {
    public static  void solution(int []arr , int k){
        int n=arr.length;
        int[]left = new int[n];
        int []right= new int[n];
        int [] pSum = new int[n];

        for(int i=0; i<n; i++){
            if(i==0){
                pSum[i]=arr[i];
            }
            else{
                pSum[i]=pSum[i-1]+arr[i];
            }
        }


        int sum =0;
        for(int i=0; i<n; i++){
            if(i<k){
                sum+=arr[i];
                left[i]=sum;
            }
            else{
                sum+=arr[i]-arr[i-k];
                left[i]=Math.max(left[i-1],sum);
            }
        }
        sum =0;
        for(int i=n-1; i>=0; i--){
            if(i+k >=n){
                sum+=arr[i];
                right[i]=sum;
            }
            else{
                sum+=arr[i]-arr[i+k];
                right[i]=Math.max(right[i+1],sum);
            }
        }
        int maxSum =0;
        int lsum =0;
        int spmsa =-1;
        int rsum =0;

        for(int i=k; i<=n-2*k; i++){
            if(left[i-1] +right[i+k] + (pSum[i+k-1] -pSum[i-1]) >maxSum){
                maxSum =left[i-1] +right[i+k]+(pSum[i+k-1] -pSum[i-1]);
                lsum = left[i-1];
                rsum =right[i+k];
                spmsa=i;
            }
        }
        System.out.print(maxSum + " ");

        for(int i=k-1; i<spmsa;i++){
            if(pSum[i]-(i-k<0?0:pSum[i-k]) ==lsum){
                System.out.print((i-k+1) + " ");
                break;
            }
        }

        System.out.print(spmsa + " ");

        for(int i= spmsa+ (2*k)-1; i<n; i++){
            if(pSum[i]-pSum[i-k] ==rsum){
                System.out.print((i-k+1)+  " " );
                break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solution(arr,k);
    }

}