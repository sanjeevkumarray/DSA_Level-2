package CompanyTest;
import java.util.*;
public class Count_Pairs_In_Array_Divisible_ByK {

    class Solution
    {
        public static long countKdivPairs(int arr[], int n, int k)
        {
            //code here
            //method1
            //  long ans =0;
            //  int []cnt = new int[k];
            //   for(int i=0; i<n;i++){
            //         ans+=cnt[(k-arr[i]%k)%k];
            //         cnt[arr[i]%k]++;
            //   }
            //      return ans;

               // method 2
            HashMap<Integer,Integer> map = new HashMap<>();
            long ans = 0;
            for(int i=0;i<n;i++){
                if(map.containsKey((k-(arr[i]%k))%k))ans+=(map.get((k-(arr[i]%k))%k));
                map.put(arr[i]%k,map.getOrDefault((arr[i]%k),0)+1);
            }
            return ans;
        }
    }
}
