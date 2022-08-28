package Searching_And_Sorting;
import java.util.*;
public class Maximize_Sum_Of_An_Array {
    //Maximize Sum Of Arr[i]*i Of An Array
    public static int maximise(int[]arr) {
        //write your code here
        Arrays.sort(arr);

        int ans = 0;

        for(int i=0; i < arr.length;i++) {
            ans  += arr[i]*i;
        }

        return ans;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = maximise(arr);
        System.out.println(ans);
    }
}
