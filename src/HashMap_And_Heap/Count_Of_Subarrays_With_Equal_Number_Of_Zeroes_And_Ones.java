package HashMap_And_Heap;
import java.util.*;
public class Count_Of_Subarrays_With_Equal_Number_Of_Zeroes_And_Ones {



        public static int solution(int[] arr) {
            int ans =0;
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,1);
            int sum =0;

            for(int val:arr){
                if(val==0){
                    sum+=-1;
                }
                else  {
                    sum+=+1;
                }
                if(map.containsKey(sum)){
                    ans+=map.get(sum);
                    map.put(sum,map.get(sum)+1);
                }

                else{
                    map.put(sum,1);
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
//       6
//        0 1 1 0 1 1
//        Sample Output
//        4
//
