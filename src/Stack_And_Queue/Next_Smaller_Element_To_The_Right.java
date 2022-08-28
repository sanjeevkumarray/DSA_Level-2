package Stack_And_Queue;
import java.io.*;
import java.util.*;

public class Next_Smaller_Element_To_The_Right {

        public static void display(int[] a) {
            StringBuilder sb = new StringBuilder();

            for (int val : a) {
                sb.append(val + "\n");
            }
            System.out.println(sb);
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }

            int[] nge = solve(a);
            display(nge);
        }

        public static int[] solve(int[] arr) {
            // solve
            int n =arr.length;
             int sr[] = new int[n];

             Stack<Integer > st = new Stack<>();

             for(int i=n-1; i>=0; i--){
                   while(st.size()>0  && st.peek()>= arr[i])st.pop();

                     int ans;
                      if(st.size()>0){
                           ans=st.peek() ;
                      }else{
                          ans=-1;
                      }
                      sr[i]=ans;
                      st.push(arr[i]);
             }
            return sr;
        }

    }

//    Sample Input
//      5
//        5
//        3
//        8
//        -2
//        7
//        Sample Output
//        3
//        -2
//        -2
//        -1
//        -1
//
