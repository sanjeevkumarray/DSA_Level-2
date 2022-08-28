package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Distinct_Echo_Substrings {
}
  class Solution {
    public int distinctEchoSubstrings(String text) {
        int n = text.length();

        HashSet<String> set = new HashSet<>();


        for(int len =1; len<=n/2; len++){
            int count =0;
            for(int l=0, r=len; r<n; l++, r++){


                if(text.charAt(l) ==text.charAt(r)){
                    count++;
                }
                else{
                    count =0;
                }
                if(count== len){
                    String str = text.substring(l,r+1);
                    set.add(str);
                    count--;
                }

            }
        }
        return set.size();
    }
}


//Delete and Earn
//class Solution{
//    public int deleteAndEarn(int[]nums){
//        int inc =0;
//        int exc=0;
//        int cnt[]= new int[10001];
//        for(int val:nums)cnt[val]++;
//        for(int i=0; i<=10000; i++){
//            int ni = exc+cnt[i]*i;
//            int ne = Math.max(inc, exc);
//
//            inc =ni;
//            exc=ne;
//        }
//        return Math.max(inc,exc);
//    }
//}
