package Bit_Manipulation;
import java.io.*;
import java.util.*;
public class Print_Value_Of_Rsb_Mask {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(Integer.toBinaryString(n & ((~n) + 1)));
    }
}
