package CompanyTest;
import java.util.*;
import java.lang.*;
import java.io.*;

//  Program to find a missing number in an array of 1 to 100
public class Test5 {
        public static  int MissingNo(int arr[], int m){
            int ans =1;
            for(int i=2; i<=(m+1);i++){
                ans+=i;
                ans-=arr[i-2];
            }
            return ans;
        }
        public static void main (String[] args) throws java.lang.Exception
        {
            int a[]= {1,2,  4, 5};
            System.out.println(MissingNo(a,a.length));
        }
    }

