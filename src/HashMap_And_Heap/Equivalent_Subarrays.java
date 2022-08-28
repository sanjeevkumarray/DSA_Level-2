package HashMap_And_Heap;
import java.util.*;
public class Equivalent_Subarrays {


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i  < n; i++){
                arr[i] = scn.nextInt();
                set.add(arr[i]);
            }
            //write your code here


            int  k= set.size();
            int ans =0;
            int i=-1;
            int j=-1;
            HashMap<Integer, Integer> map = new HashMap<>();
            while(true){
                boolean f1 = false;
                boolean f2 = false;
                while(i<arr.length-1){
                    f1= true;
                    i++;
                    map.put(arr[i] ,map.getOrDefault(arr[i], 0)+1);
                    if(map.size()==k){
                        ans+=arr.length-i;
                        break;
                    }
                }
                while(j<i){
                    f2 = true;
                    j++;
                    if(map.get(arr[j]) ==1){
                        map.remove(arr[j]);
                    }
                    else{
                        map.put(arr[j], map.get(arr[j])-1);
                    }
                    if(map.size()==k){
                        ans+=arr.length-i;
                    }
                    else{
                        break;
                    }
                }

                if(f1== false && f2== false){
                    break;
                }
            }

            System.out.println(ans);

        }


    }



//    Sample Input
//         5
//        2 1 3 2 3
//        Sample Output
//        5





