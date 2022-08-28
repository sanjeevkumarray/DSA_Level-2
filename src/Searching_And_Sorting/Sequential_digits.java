package Searching_And_Sorting;
import java.util.*;
public class Sequential_digits {
    public static ArrayList<Integer> sequentialDigits(int low, int high) {
        int[] allNums = {12, 23, 34, 45, 56, 67, 78, 89,
                123, 234, 345, 456, 567, 678, 789,
                1234, 2345, 3456, 4567, 5678, 6789,
                12345, 23456, 34567, 45678, 56789,
                123456, 234567, 345678, 456789,
                1234567, 2345678, 3456789,
                12345678, 23456789,
                123456789
        };

        ArrayList<Integer> res = new ArrayList<>();
        int n = allNums.length;
        for (int i = 0; i < n; i++) {
            if (allNums[i] < low) continue;
            if (allNums[i] > high) break;
            res.add(allNums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<Integer> ans = sequentialDigits(n, m);
        System.out.println(ans);
    }
}
/*
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 9; ++i) {
            int  sum = i, n = sum;
            while (n <= high && sum < 10) {
                if (n >= low) {
                    res.add(n);
                }
                n = n * 10 + ++sum;
            }
        }
        Collections.sort(res);
        return res;
    }
}
 */