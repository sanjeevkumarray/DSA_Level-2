//package CompanyTest;
//import java.io.*;
//import java.util.*;
//public class Merge_Two_Sorted_Linked_Lists {
//
//    class LinkedList
//    {
//        //Function to merge two sorted linked list.
//        Node sortedMerge(Node head1, Node head2) {
//            // This is a "method-only" submission.
//            // You only need to complete this method
//            if(head1 == null)return head2;
//            if(head2 == null)return head1;
//            Node curr = null;
//            if(head1.data<head2.data){
//                head1.next  = sortedMerge(head1.next,head2);
//                curr = head1;
//            }
//            else{
//                head2.next = sortedMerge(head1,head2.next);
//                curr = head2;
//
//            }
//            return curr;
//        }
//    }
//}


//  456. 132 Pattern
//class Solution {
//    public boolean find132pattern(int[] nums) {
//        int res=Integer.MIN_VALUE;
//        int cnt=nums.length;
//        for(int i=nums.length-1;i>=0;i--){
//            if(nums[i]<res) return true;
//            else while(cnt<nums.length && nums[i]>nums[cnt]) res=nums[cnt++];
//            nums[--cnt]=nums[i];
//        }
//        return false;
//    }
//}

//Search a 2D Matrix
//
//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int n =matrix.length ;
//        int r = 0, c = matrix[0].length-1;
//        while(r <n && c >= 0) {
//            if(matrix[r][c] == target) return true;
//            else if(matrix[r][c] < target) r++;
//            else c--;
//        }
//        return false;
//    }
//}


//  1351. Count Negative Numbers in a Sorted Matrix
//class Solution {
//    public int countNegatives(int[][] grid) {
//        int m = grid.length;
//        int n= grid[0].length;
//        int cnt = 0;
//        for (int i = 0; i < m ; i++) {
//            for (int j = 0; j < n; j++) {
//                // if (grid[i][j] < 0){
//                //    cnt += grid[i].length - j;
//                //     break;
//                if(grid[i][j]<0){
//                    cnt++;
//                }
//            }
//        }
//        return cnt;
//    }
//}