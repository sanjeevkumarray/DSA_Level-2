package SDE_SHEET;
import java.util.*;
public class Kadanes_Algorithm {

//    Solution 1: Naive Approach
//
//    Approach: Using three for loops, we will get all possible subarrays in two loops and their sum in another loop,
//    and then return the maximum of them.

        public static int maxSubArray(int[] nums, ArrayList < Integer > subarray) {
            int max_sum = 0;
            int n = nums.length;
            if (n == 1) {
                return nums[0];
            }
            for (int i = 0; i <= n - 1; i++) {
                for (int j = i; j <= n - 1; j++) {
                    int sum = 0;
                    for (int k = i; k <= j; k++)
                        sum = sum + nums[k];
                    if (sum > max_sum) {
                        subarray.clear();
                        max_sum = sum;
                        subarray.add(i);
                        subarray.add(j);
                    }
                }
            }
            return max_sum;
        }
        public static void main(String args[]) {
            int arr[]={-2,1,-3,4,-1,2,1,-5,4};
            ArrayList < Integer > subarray = new ArrayList < > ();
            int lon = maxSubArray(arr, subarray);
            System.out.println("The longest subarray with maximum sum is " + lon);
            System.out.println("The subarray is ");
            for (int i = subarray.get(0); i <= subarray.get(1); i++) {
                System.out.print(arr[i] + " ");
            }

        }
    }

//       Solution 2: A better approach
//
//               Approach :
//               We can also do this problem using only two for loop, starting the function with ( max_sum ) variable which will have the final answer.
//        We can get the sum of all possible subarrays in this way and then return the maximum so far.

//   import java.util.*;
//class Solution {
//    public static int maxSubArray(int[] nums, ArrayList < Integer > subarray) {
//        int max_sum = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int curr_sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                curr_sum += nums[j];
//                if (curr_sum > max_sum) {
//                    subarray.clear();
//                    max_sum = curr_sum;
//                    subarray.add(i);
//                    subarray.add(j);
//                }
//            }
//        }
//        return max_sum;
//    }
//    public static void main(String args[]) {
//        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//        ArrayList < Integer > subarray = new ArrayList < > ();
//        int lon = maxSubArray(arr, subarray);
//        System.out.println("The longest subarray with maximum sum is " + lon);
//        System.out.println("The subarray is ");
//        for (int i = subarray.get(0); i <= subarray.get(1); i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//}