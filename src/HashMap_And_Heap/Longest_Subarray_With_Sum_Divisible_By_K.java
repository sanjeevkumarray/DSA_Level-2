package HashMap_And_Heap;
import java.util.*;
public class Longest_Subarray_With_Sum_Divisible_By_K {


        public static int solution(int[] arr, int k) {
            int ans=0;
            HashMap<Integer,Integer> map= new  HashMap<>();
            int sum =0;
            int rem =0;
            map.put(0,-1);
            for(int i=0; i<arr.length;i++){
                sum+=arr[i];
                rem =sum%k;

                if(rem<0){
                    rem+=k;
                }

                if(map.containsKey(rem)){
                    int idx = map.get(rem);
                    int len =i-idx;
                    if(len>ans){
                        ans =len;
                    }
                }
                else{
                    map.put(rem,i);
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int k = scn.nextInt();
            System.out.println(solution(arr, k));
        }

    }

//    Sample Input
//       6
//        2 7 6 1 4 5
//        3
//        Sample Output
//        4

