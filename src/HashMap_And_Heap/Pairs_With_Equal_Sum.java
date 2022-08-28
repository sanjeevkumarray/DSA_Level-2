package HashMap_And_Heap;
import java.util.*;

public class Pairs_With_Equal_Sum {


        public static boolean solution(int[] arr) {
            HashSet<Integer> set = new HashSet<>();

            for(int i=0; i<arr.length;i++){
                for(int j=i+1; j<arr.length;j++){
                    int sum =arr[i]+arr[j];
                    if(set.contains(sum)){
                        return true;
                    }
                    else{
                        set.add(sum);
                    }
                }
            }

            return false;
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
//      8
//        1 2 998 72 87576 21 45 -1
//        Sample Output
//        false
