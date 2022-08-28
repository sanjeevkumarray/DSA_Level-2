package CompanyTest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Test4 {
         public static void removeDuplicates(int[] arr, int m) {
            HashMap<Integer, Boolean> map = new HashMap<>();
             for (int i = 0; i < m; ++i) {
                if (map.get(arr[i]) == null) {
                    System.out.print(arr[i] + " ");
                    map.put(arr[i], true);
                }
            }
        }
        public static void main(String[] args)
        {
            int[] a = { 1, 2, 5, 1, 7, 2, 4, 2 ,3,3,8,8 ,9,9, 6,6,6};
            int m = a.length;
            removeDuplicates(a, m);
        }
    }


