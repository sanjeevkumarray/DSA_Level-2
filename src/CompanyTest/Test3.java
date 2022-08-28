package CompanyTest;
import java.util.*;
import java.lang.*;
import java.io.*;
// print ***
// print * *
//print ***
public class Test3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         for(int i=1; i<=3;i++){
             for(int j=1; j<=3;j++) {
                 if (i % 2 == 0 && j % 2 == 0)
                     System.out.print(" ");
                     else
                     System.out.print("*");
             }
             System.out.println();
         }
    }
}
