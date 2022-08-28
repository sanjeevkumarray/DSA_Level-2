package Bit_Manipulation;
import java.util.*;
import java.io.*;
public class Find_Longest_Awesome_Substring {
    public static int longestAwesome(String s) {
        Integer map[] = new Integer[1 << (10)];
        map[0] = -1;

        int ans = 0;
        int state = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            int mask = (1 << (ch - '0'));
            state = state ^ mask;

            Integer j = map[state];
            if (j != null) {
                ans = Math.max(ans, i - j);
            }

            for (int odd = 0; odd < 10; odd++) {
                mask = 1 << odd;
                j = map[state ^ mask];
                if (j != null) {
                    ans = Math.max(ans, i - j);
                }
            }

            if (map[state] == null) {
                map[state] = i;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println(longestAwesome(s));
    }
}
