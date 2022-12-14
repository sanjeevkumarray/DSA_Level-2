package HashMap_And_Heap;
import java.util.*;
public class Largest_Subarray_With_Zero_Sum {

        public static int solution(int[] arr) {
            HashMap<Integer,Integer> map= new HashMap<>();
            int mlen =0;
            int i=-1;
            int sum =0;
            map.put(sum,i);
            while(i<arr.length-1){
                i++;
                sum+=arr[i];

                if(map.containsKey(sum)== false){
                    map.put(sum,i);
                }
                else{
                    int len =i-map.get(sum);
                    if(len>mlen){
                        mlen =len;
                    }
                }
            }

            return mlen;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int[] arr = new int[scn.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(solution(arr));
        }

    }


