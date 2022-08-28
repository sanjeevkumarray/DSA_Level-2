package CompanyTest;
import java.util.*;
import java.lang.*;
import java.io.*;
//  Program  to remove  given character from strings
public class Test6 {
        public  static void removeChar( String st, char ch){
            int   j, cnt = 0,  n= st.length();
            char[]   p = st.toCharArray();
            for(int i=j=0; i<n; i++){
                if(p[i] !=ch)
                    p[j++]=p[i];
                else
                    cnt++;
            }
            while(cnt>0){
                p[j++]='\0';
                cnt --;
            }
            System.out.println(p);
        }
        public static void main (String[] args) throws java.lang.Exception
        {
            String st =   "sanjeev";
            removeChar(st,'s');
        }
    }

