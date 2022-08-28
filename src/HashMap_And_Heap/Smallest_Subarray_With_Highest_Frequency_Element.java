package HashMap_And_Heap;
import java.net.SocketOption;
import java.util.*;

public class Smallest_Subarray_With_Highest_Frequency_Element {

        public static void solution(int[] arr) {
            HashMap<Integer,Integer> fmap = new HashMap<>() ;
            HashMap<Integer,Integer> smap = new HashMap<>() ;

            int hfreq= 0;
             int si=0;
             int ei=0;
              int len =ei-si+1;

              for(int i=0; i<arr.length;i++){
                   if(fmap.containsKey(arr[i])){
                        fmap.put(arr[i],fmap.get(arr[i])+ 1);
                  }
                  else{
                       fmap.put(arr[i],1);
                        smap.put(arr[i],i);
                   }

                   if(fmap.get(arr[i])>hfreq){
                        hfreq =fmap.get(arr[i]);
                        si=smap.get(arr[i]);
                         ei=i;
                         len=ei-si+1;
                   } else if (fmap.get(arr[i]) == hfreq) {
                        int clen =i-smap.get(arr[i])+1;
                        if(clen<len){
                            hfreq  =fmap.get(arr[i]);
                            si=smap.get(arr[i]);
                             ei=i;
                             len=ei-si+1;
                        }

                   }
              }
         System.out.println(arr[si] );
              System.out.println(si );
            System.out.println(ei );
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = scn.nextInt();
            }
            solution(arr);
        }

    }
//    Sample Input
//    8
//        4 1 1 2 2 1 3 3
//        Sample Output
//        1
//        1
//        5

