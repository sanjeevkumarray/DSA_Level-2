package CompanyTest;
import java.util.*;
public class Maximizer {
    static String max;
    public static String swap(String str, int i, int j)
    {
        char ith = str.charAt(i);
        char jth = str.charAt(j);
        String left = str.substring(0, i);
        String middle = str.substring(i + 1, j);
        String right = str.substring(j + 1);

        return left + jth + middle + ith + right;
    }
    public static void findMaximum(String str, int k) {
        if (Integer.parseInt(str) > Integer.parseInt(max)) {
            max = str;
        }
        if (k == 0) {
            return;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                str = swap(str, i, j);
                findMaximum(str, k - 1);
                str = swap(str, i, j);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        max = str;
        findMaximum(str, k);
        scn.close();
        System.out.println(max);
    }

}

