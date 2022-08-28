package Bit_Manipulation;
import java.io.*;
import java.util.*;
public class Xor_Of_Sum_Of_All_Pairs {
    public static int solution(int[] arr){
        int ans = 0;
        for(int i = 0 ; i < arr.length; i++){
            ans ^= (2 * arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
}
