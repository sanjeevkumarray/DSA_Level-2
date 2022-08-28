package Bit_Manipulation;
import java.io.*;
import java.util.*;
public class Flip_Bits_To_Convert_A_To_B {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int xor = a ^ b;
        int ans = 0;
        while(xor != 0){
            xor &= (xor - 1);
            ans++;
        }
        System.out.println(ans);
    }

}
