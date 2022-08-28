package Bit_Manipulation;
import java.util.*;
public class Minimum_Flips_Required_To_Make_A_Or_B_Equal_To_C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        System.out.println(minFlips(a,b,c));
    }

    public static int minFlips(int a, int b, int c) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            boolean aa = false;
            boolean bb = false;
            boolean cc = false;

            if ( (a & (1 << i)) != 0) aa = true;
            if ( (b & (1 << i)) != 0) bb = true;
            if ( (c & (1 << i)) != 0) cc = true;
            if (cc) {
                if (!aa && !bb ) res++;
            } else {
                if (aa && bb) res += 2;
                else if (aa || bb) res++;
            }
        }
        return res;
    }
}
