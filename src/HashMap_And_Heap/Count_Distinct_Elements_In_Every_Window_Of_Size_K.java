package HashMap_And_Heap;
import java.util.*;
public class Count_Distinct_Elements_In_Every_Window_Of_Size_K {

        public static ArrayList<Integer> solution(int[] arr, int k) {
            //write your code here
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer,Integer> map= new HashMap<>();

            for(int i=0; i<=k-2; i++){
                map.put(arr[i] ,map.getOrDefault(arr[i],0)+1);
            }
            for(int j=0, i=k-1; i<arr.length;){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                list.add(map.size());


                int freq = map.get(arr[j]);
                if(freq==1){
                    map.remove(arr[j]);
                }
                else{
                    map.put(arr[j],freq-1);
                }
                i++;
                j++;
            }


            return  list;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int[] arr = new int[scn.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int k = scn.nextInt();
            ArrayList<Integer> ans = solution(arr,k);
            for(int a : ans){
                System.out.print(a + " ");
            }
        }


    }
