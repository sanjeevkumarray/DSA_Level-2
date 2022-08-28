package Searching_And_Sorting;
import java.util.*;
public class Pancake_Sorting {
    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int maxIdx = i;
            for (int j = i - 1; j >= 0; j--) maxIdx = (arr[j] > arr[maxIdx] ? j : maxIdx);
            if (maxIdx != i) {
                reverse(arr, 0, maxIdx);
                ans.add(maxIdx + 1);
                if (i == n - 1) reverse(arr, 0, i);
                else reverse(arr, 0, i);
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; ++i){
            arr[i]=scn.nextInt();
        }

        System.out.println(pancakeSort(arr));
        scn.close();
    }
}
