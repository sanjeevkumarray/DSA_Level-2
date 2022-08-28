package HashMap_And_Heap;
import java.util.*;
public class Longest_Subarray_With_Equal_Number_Of_Zeroes_And_Ones {


        public static int solution(int[] arr) {
            int ans =0;
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,-1);
            int sum =0;

            for(int i=0; i<arr.length;i++){
                if(arr[i]==0){
                    sum+=-1;
                }
                else  if(arr[i]==1){
                    sum+=+1;
                }
                if(map.containsKey(sum)){
                    int idx = map.get(sum);
                    int len =i-idx;
                    if(len>ans){
                        ans = len;
                    }
                }
                else{
                    map.put(sum,i);
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
            System.out.println(solution(arr));
        }

    }


//    Sample Input
//      6
//        0 1 1 0 1 1
//        Sample Output
//        4