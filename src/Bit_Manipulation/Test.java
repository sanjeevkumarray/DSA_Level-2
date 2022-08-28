package Bit_Manipulation;
import java.util.Arrays ;
//Write a program to remove a 2nd element from an array
//You can take predefined array
//Like 2,6,8,5,9
public class Test {
    public static int remove(int[] arr, int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }

        if (i < n) {
            n = n - 1;

            for (int j = i; j < n; j++) {
                arr[i] = arr[j + 1];
            }
        }
        return n;

    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 8, 5, 9};
        int n = arr.length;
        int x = 9;
        n = remove(arr, n, x);
        System.out.println("Simple arrays is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }

    }
}





