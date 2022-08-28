package Stack_And_Queue;
import java.io.*;
import java.util.*;
public class Score_Of_Parentheses {
        public static int scoreOfParentheses(String S) {
            Stack<Integer> st= new Stack<>();
            for(int i=0; i<S.length();i++){
                if(S.charAt(i)=='('){
                    st.push(-1);
                }
                else{
                    if(st.peek()==-1){
                        st.pop();
                        st.push(1);
                    }
                    else{
                        int val =0;
                        while(st.peek()!=-1){
                            val+=st.pop();
                        }
                        st.pop();
                        st.push(2*val);
                    }
                }
            }

            int val =0;
            while(st.size()>0){
                val+=st.pop();
            }
            return val;

        }
        public static void main(String[] args) throws Exception {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            int score = scoreOfParentheses(read.readLine());
            System.out.println(score);

        }
    }


//    Sample Input
//            (()(()))
//        Sample Output
//        6


//class Solution {
//    public int scoreOfParentheses(String Str) {
//        int len = Str.length(), parentheses = 0, res = 0;
//        for (int i = 1; i < len; i++)
//            if (Str.charAt(i) == '(') parentheses++;
//            else if (Str.charAt(i-1) == '(') res += 1 << parentheses--;
//            else parentheses--;
//        return res;
//    }
//}