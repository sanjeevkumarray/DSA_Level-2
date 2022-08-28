package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Arithmetic_Slices2 {
        public static int solution(int[] arr) {
            int ans =0;
            HashMap<Integer,Integer> []maps = new HashMap[arr.length];
            for(int i=0; i<arr.length;i++){
                maps[i]=new HashMap<>();
            }
            for(int i=1; i<maps.length;i++){
                for(int j=0; j<i; j++){
                    long cd = (long)arr[i]-(long)arr[j];
                    if(cd<=Integer.MIN_VALUE ||cd>=Integer.MAX_VALUE){
                        continue;

                    }
                    int   r= maps[j].getOrDefault((int)cd,0);
                    int q= maps[i].getOrDefault((int)cd,0);

                    ans+=r;
                    maps[i].put((int)cd, q +r+1);
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = scn.nextInt();
            }
            System.out.println(solution(arr));
        }

    }

