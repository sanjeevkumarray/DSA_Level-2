package HashMap_And_Heap;
import java.util.*;
public class Longest_Subarray_With_Equal_Number_Of_0s_s_And_2s {

        public static int solution(int[] arr) {
            int ans=0;
            HashMap<String ,Integer> map= new HashMap<>();
            int countz=0;
            int counto=0;
            int countt=0;
            int delta10= counto-countz;
            int delta21=countt-counto;
            String key = delta21 + "#" + delta10;
            map.put(key,-1);
            for(int i=0; i<arr.length;i++){
                if(arr[i]==0){
                    countz++;
                }
                else if (arr[i]==1){
                    counto++;
                }
                else{
                    countt++;
                }
                delta10= counto-countz;
                delta21= countt-counto;
                key =delta21 + "#" + delta10;

                if(map.containsKey(key)){
                    int idx= map.get(key);
                    int len =i-idx;
                    if(len>ans){
                        ans = len;
                    }
                }
                else{
                    map.put(key,i);
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
//     7
//        0 1 0 2 0 1 0
//        Sample Output
//        3