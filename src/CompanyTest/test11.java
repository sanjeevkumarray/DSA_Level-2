package CompanyTest;
import java.util.Scanner;
public class test11 {
    public static void main(String[] args) {
        String  st="anant";
         int sum =0;
         int a=10 , n=30, t=20;
          for(int i=0; i<st.length();i++){
              if(Character.isDigit(st.charAt(i)));
              sum=sum+Character.getNumericValue(st.charAt(i));
          }
          System.out.println(sum);
    }
}
