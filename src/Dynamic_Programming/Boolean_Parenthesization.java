package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Boolean_Parenthesization {
    public static int solution(String str1, String str2) {
        int n = str1.length();
        int[][] t = new int[n][n];
        int[][] f = new int[n][n];
        for (int gap = 0; gap < n; gap++) {
            int si = 0, ei = gap;
            while (ei < n) {
                if (gap == 0) {
                    t[si][ei] = str1.charAt(si) == 'T' ? 1 : 0;
                    f[si][ei] = str1.charAt(si) == 'F' ? 1 : 0;
                } else {
                    for (int cp = si; cp < ei; cp++) {
                        char sign = str2.charAt(cp);
                        if (sign == '&') {
                            t[si][ei] += t[si][cp] * t[cp + 1][ei];
                            f[si][ei] += ((t[si][cp] * f[cp + 1][ei]) + (f[si][cp] * t[cp + 1][ei])
                                    + (f[si][cp] * f[cp + 1][ei]));
                        }
                        if (sign == '|') {
                            t[si][ei] += ((t[si][cp] * t[cp + 1][ei]) + (t[si][cp] * f[cp + 1][ei])
                                    + (f[si][cp] * t[cp + 1][ei]));
                            f[si][ei] += ((f[si][cp]) * (f[cp + 1][ei]));
                        }
                        if (sign == '^') {
                            t[si][ei] += ((t[si][cp] * f[cp + 1][ei]) + (f[si][cp] * t[cp + 1][ei]));
                            f[si][ei] += ((t[si][cp] * t[cp + 1][ei]) + (f[si][cp] * f[cp + 1][ei]));
                        }
                    }
                }
                si++;
                ei++;
            }
        }
        return (t[0][t[0].length - 1]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(solution(s1, s2));
    }
}




//    public static int solution (String str1, String str2){
//        int n = str1.length();
//        int[][] dpt = new int[n]n];
//        int [][] dpf = new int[n][n];
//        for(int g=0; g<n;g++){
//            for(int i=0; j=g; j<n; i++,j++){
//                if(g==0){
//                    char ch = str1.charAt(i);
//                    if(ch=='T'){
//                        dpt[i][j]=1;
//                        dpf[i][j]=0;
//                    }
//                    else{
//                        dpt[i][j]= 0;
//                        dpf[i][j]=1;
//                    }
//  else{
//                        for(int k=1; k<j; k++){
//                            char oprtr = str2.charAt(k);
//                            int ltc = dpt[i][j];
//                            int rtc=dpf[k+1][j];
//                            int lfc=dpf[i][k];
//                            int rfc=dpf[k+1][j];
//
//                            if(oprtr=='&'){
//                                dpt[i][j] =ltc*rtc;
//                                dpf[i][j]= ltc*rtc +ltc*rfc+lfc*rfc;
//                            }
//                            else if (oprtr=='|'){
//                                dpt[i][j]= ltc*rtc+lfc*rtc+ltc*rfc;
//                                dpf[i][j]=lfc*rfc;
//                            }
//                            else { // xor^
//                                dpt[i][j]= ltc*rfc+lfc*rtc;
//                                dpf[i][j]=lfc*rfc+ltc*rtc;
//                            }
//                        }
//                    }
//                }
//            }
//            return dpt[0][n-1];
//        }
//
//        public static void main(String[] args){
//            Scanner sc= new Scanner(System.in);
//            String s1= sc.next();
//            String s2= sc.next();
//            System.out.println(solution(s1,s2);
//        }
//
//
//
//
