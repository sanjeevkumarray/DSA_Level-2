package CompanyTest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class test10 {
    public static void main(String[] args) {
             Scanner  sc= new Scanner(System.in);
              System.out.print("Enter  N:");
               int N=sc.nextInt();
//                for(int i=1; i<=N;i++){
//                      for(int j=1; j<=i;j++){
//                          if(j%2==1){
//                           System.out.print("1 ");
////                           System.out.print(" ");
//                      }
//                      else{
//                          //System.out.print(" ");
//                          System.out.print("0 ");
//                          }
//
//                    }
//                    System.out.print(" ");
//                      System.out.println();

                int k=0;
                 for(int i=1; i<=N;i++, k=0){
                     for(int j=1; j<=i-1;j++){
                         System.out.print(" ");
                     }
                     while(k!=2*i-1){
                         System.out.print("1");
                         k++;
                     }
                     System.out.print("0");
                }
                 System.out.println();
    }
}
