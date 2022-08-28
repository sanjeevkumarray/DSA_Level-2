package CompanyTest;

public class Largest_Number_with_given_sum {
    class Solution
    {
        //Function to return the largest possible number of n digits
        //with sum equal to given sum.
        static String largestNumber(int n, int sum)
        {
            // add your code here
            StringBuilder sb=new StringBuilder();
            while(n-->0 && sum>=0){
                int ans=Math.min(9, sum);
                sb.append(ans);
                sum-=ans;
            }
            if(sum>0) return "-1";
            else
                return sb.toString();
        }
    }

}


//    Find Minimum in Rotated Sorted Array
//class Solution {
//    public int findMin(int[] nums) {
//        int s=0;
//        int e= nums.length-1;
//        while(s<e){
//            int m=s+(e-s)/2;
//            if(nums[m]>nums[e])s=m+1;
//            else  e=m;
//        }
//        return nums[s];
//    }
//}


//    Count Sorted Vowel Strings
//class Solution {
//    public int countVowelStrings(int n) {
//
//        return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
//    }
//}

// int[] dp = new int[] {0, 1, 1, 1, 1, 1};
//        for (int i = 1; i <= n; ++i)
//            for (int k = 1; k <= 5; ++k)
//                dp[k] += dp[k - 1];
//        return dp[5];


//    Monotonic Array
//class Solution {
//    public boolean isMonotonic(int[] A) {
//        boolean increasing = true;
//        boolean decreasing = true;
//        for (int i = 0; i < A.length - 1; ++i) {
//            if (A[i] > A[i+1])
//                increasing = false;
//            if (A[i] < A[i+1])
//                decreasing = false;
//        }
//
//        return increasing || decreasing;
//    }
//}