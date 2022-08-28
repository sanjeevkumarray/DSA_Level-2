package CompanyTest;

public class Search_In_Rotated_Sorted_Array {
    class Solution {
        public int search(int[] nums, int target) {
            int s=0;
            int e= nums.length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if (nums[mid] == target){
                    return mid;
                }
                if (nums[s] <= nums[mid]){
                    if (target < nums[mid] && target >= nums[s])
                        e = mid - 1;
                    else
                        s = mid + 1;
                }

                if (nums[mid] <= nums[e]){
                    if (target > nums[mid] && target <= nums[e])
                        s = mid + 1;
                    else
                        e = mid - 1;
                }
            }
            return -1;
        }
    }


}

    //Array to BST

//class Solution
//{
//    public int[] sortedArrayToBST(int[] nums){
//        int n = nums.length;
//        int[] ans = new int[n];
//        int s = 0;
//        int e = nums.length - 1;
//        construct_BST(nums, s, e, ans);
//        idx = 0;
//        return ans;
//    }
//    private static int idx = 0;
//    private static void construct_BST(int[] nums, int s, int e, int[] ans){
//        if(s > e) return;
//        int mid = (s+e)/2;
//        ans[idx++] = nums[mid];
//        construct_BST(nums, s, mid-1, ans);
//        construct_BST(nums, mid+1, e, ans);
//    }
//
//}