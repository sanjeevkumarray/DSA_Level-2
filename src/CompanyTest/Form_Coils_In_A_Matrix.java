package CompanyTest;

public class Form_Coils_In_A_Matrix {
    class Solution {
        static int[][] formCoils(int n) {
            // code here
            int m1=8*n*n; int m2=m1;
            int[][] arr=new int[2][m1];
            int coil1 =1; int coil2=16*n*n;
            int k=4*n;
            for(int i=0; i<k; i++){
                arr[1][m1-1]=coil1;
                coil1+=4*n;
                m1--;
                arr[0][m2-1]=coil2;
                coil2-=4*n;
                m2--;
            }
            coil1-=4*n;
            coil2+=4*n;
            while(m1>0 && m2>0){
                k-=2;
                for(int i=0; i<k; i++){
                    coil1++;
                    arr[1][m1-1]=coil1;
                    m1--; coil2--;
                    arr[0][m2-1]=coil2;
                    m2--;
                }
                for(int i=0; i<k; i++){
                    coil1-=4*n;
                    arr[1][m1-1]=coil1;
                    m1--;
                    coil2+=4*n;
                    arr[0][m2-1]=coil2;
                    m2--;
                }
                k-=2;
                for(int i=0; i<k; i++){
                    coil1--;
                    arr[1][m1-1]=coil1;
                    m1--;
                    coil2++;
                    arr[0][m2-1]=coil2;
                    m2--;
                }
                for(int i=0; i<k; i++){
                    coil1+=4*n;
                    arr[1][m1-1]=coil1;
                    m1--;
                    coil2-=4*n;
                    arr[0][m2-1]=coil2;
                    m2--;
                }
            }
            return arr;
        }
    }
}

//    Maximum Product of Word Lengths

//class Solution{
//    public static int maxProduct(String[] words) {
//        int n = words.length;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            for (char ch : words[i].toCharArray()) arr[i] |= (1 << ch - 'a');
//        }
//        int maxi = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if ((arr[i] & arr[j]) == 0) maxi = Math.max(words[i].length() * words[j].length(), maxi);
//            }
//        }
//
//        return maxi;
//
//    }
//}