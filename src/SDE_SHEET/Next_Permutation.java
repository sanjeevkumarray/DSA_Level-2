package SDE_SHEET;
import java.util.*;
public class Next_Permutation {

//    Approach :
//
//    Step 1: Linearly traverse array from backward such that ith index value of the array is less than (i+1)th index value.
//    Store that index in a variable.
//
//    Step 2: If the index value received from step 1 is less than 0.
//    This means the given input array is the largest lexicographical permutation.
//
//        Hence, we will reverse the input array to get the minimum or starting permutation.
//    Linearly traverse array from backward. Find an index that has a value greater than the previously found index.
//    Store index another variable.
//
//      Step 3: Swap values present in indices found in the above two steps.
//
//            Step 4: Reverse array from index+1 where the index is found at step 1 till the end of the array.

    class Solution {
        public void nextPermutation(int[] A) {
            if (A == null || A.length <= 1) return;
            int i = A.length - 2;
            while (i >= 0 && A[i] >= A[i + 1]) i--;
            if (i >= 0) {
                int j = A.length - 1;
                while (A[j] <= A[i]) j--;
                swap(A, i, j);
            }
            reverse(A, i + 1, A.length - 1);
        }

        public void swap(int[] A, int i, int j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }

        public void reverse(int[] A, int i, int j) {
            while (i < j) swap(A, i++, j--);
        }
    }

}
