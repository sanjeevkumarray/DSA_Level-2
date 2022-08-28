package Stack_And_Queue;
import java.io.*;
import java.util.*;
public class Largest_Rectangle_In_Histogram {
        public static int largestRectangleArea(int[] heights) {
            Stack<Integer> st = new Stack<>();
            int max =0;

            st.push(-1);

            for(int i=0;i<=heights.length;i++){
                int val = i==heights.length? 0:heights[i];

                while(st.peek() >=0 && heights[st.peek()] >= val){
                    int h = heights[st.pop()];
                    int start = st.peek();
                    max = Math.max(max, h*(i-start-1));
                }
                st.push(i);
            }

            return max;
        }

        public static void main(String[] args) throws Exception {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(read.readLine());
            int heights[] = new int[n];
            for(int i=0;i<n;i++)heights[i] = Integer.parseInt(read.readLine());

            System.out.println(largestRectangleArea(heights));

        }
    }









//    Sample Input
//       6
//        2
//        1
//        5
//        6
//        2
//        3
//        Sample Output
//        10




//84. Largest Rectangle in Histogram
//class Solution {
//    public int largestRectangleArea(int[] heights) {
//        int n = heights.length;
//        Stack<Integer> st = new Stack<>();
//        int maxA = 0;
//        for(int i = 0;i<=n;i++) {
//            while(!st.isEmpty() && (i==n || heights[st.peek()] >= heights[i])) {
//                int height = heights[st.pop()];
//                int width;
//                if(st.isEmpty()) width = i;
//                else width = i - st.peek() - 1;
//
//                maxA = Math.max(maxA, width * height);
//            }
//            st.push(i);
//        }
//        return maxA;
//    }
//}