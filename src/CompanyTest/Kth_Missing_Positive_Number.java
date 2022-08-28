package CompanyTest;

public class Kth_Missing_Positive_Number {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int l = 0, r = arr.length; ;
            while (l < r) {
                int m = (l + r) / 2;
                if (arr[m] - 1 - m < k)
                    l = m + 1;
                else
                    r = m;
            }
            return l + k;
        }
    }
}


//class Solution {
//    public int minEatingSpeed(int[] piles, int h) {
//        int s = 1, e = 1000000000;
//        while (s < e) {
//            int m = (s + e) / 2, cnt = 0;
//            for (int k : piles)
//                cnt += (k + m - 1) / m;
//            if (cnt > h)
//                s = m + 1;
//            else
//                e = m;
//        }
//        return s;
//    }
//}




