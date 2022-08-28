package HashMap_And_Heap;
import java.util.*;
public class Quadruplet_Sum {

        public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target, int n) {
            // write your code here

            return null;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            ArrayList<ArrayList<Integer>> ans = fourSum(arr, target, n);
            Collections.sort(ans,(a,b)->{
                int i = 0;
                int j = 0;

                while(i < a.size()){
                    if(a.get(i) == b.get(j)){
                        i++;
                        j++;
                    }else{
                        return a.get(i) - b.get(j);
                    }
                }

                return 0;
            });
            for (ArrayList<Integer> a : ans) {
                for (int element : a) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

    }


