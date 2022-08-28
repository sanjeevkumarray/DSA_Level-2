package HashMap_And_Heap;
import java.util.*;
public class Pairs_With_Given_Sum_In_Two_Sorted_Matrices {

        public static int solve(int[][] num1, int[][] num2, int k) {
           HashMap<Integer,Integer> map= new HashMap<>();
             for(int i=0; i<num1.length;i++){
                 for(int j=0; j<num1[0].length;j++){
                       map.put(num1[i][j],map.getOrDefault(num1[i][j],0)+1 );

                 }
             }


             int count =0;
                for(int i=0; i<num2.length;i++){
                    for(int j=0; j<num2[0].length;j++){
                          int val =num2[i][j];
                          int com = k-val;
                          if(map.containsKey(com)){
                              count+=map.get(com);
                          }
                    }
                }

            return count ;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[][] mat1 = new int[N][N];
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[0].length; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }

            int[][] mat2 = new int[N][N];
            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2[0].length; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
            int K = sc.nextInt();
            System.out.println(solve(mat1, mat2, K));

        }

    }


//    Sample Input
//        3
//        1 5 6
//        8 10 11
//        15 16 18
//        2 4 7
//        9 10 12
//        13 16 20
//        21
//        Sample Output
//        4