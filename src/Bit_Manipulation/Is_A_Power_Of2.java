package Bit_Manipulation;
import java.io.*;
import java.util.*;
public class Is_A_Power_Of2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println((n & (n - 1)) == 0);
    }
}
