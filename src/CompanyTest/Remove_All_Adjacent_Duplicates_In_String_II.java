package CompanyTest;
import java.io.*;
import java.util.*;
public class Remove_All_Adjacent_Duplicates_In_String_II {
    class Solution {
        public String removeDuplicates(String S, int K) {
            char[] ch = S.toCharArray();
            int i, j;
            Stack<Integer> st = new Stack<>();
            st.add(0);
            for (i = 1, j = 1; j < S.length(); i++, j++) {
                char chr = ch[i] = ch[j];
                if (i == 0 || chr != ch[i-1]) st.add(i);
                else if (i - st.peek() + 1 == K) i = st.pop() - 1;
            }
            return new String(ch, 0, i);
        }
    }
}
