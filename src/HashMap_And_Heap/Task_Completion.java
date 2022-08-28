package HashMap_And_Heap;
import java.util.*;
public class Task_Completion {

        public static void completeTask(int n, int m, int[] arr) {
            HashSet<Integer> completed = new HashSet<>();
             for(int val:arr){
                 completed.add(val);
             }

             boolean  flag = true;
             ArrayList<Integer>one = new ArrayList<>();
             ArrayList<Integer >two= new ArrayList<>() ;

             for(int i=1; i<=n;i++){
                  if(completed.contains(i)== false){
                        if(flag){
                             one.add(i);
                        }else{
                             two.add(i);
                        }
                        flag =!flag;
                  }
             }

             for(int val:one){
                 System.out.print(val + " ");
             }
             System.out.println();

            for(int val:two){
                System.out.print(val + " ");
            }
            System.out.println();

        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] num = new int[m];
            for (int i = 0; i < m; i++) {
                num[i] = scn.nextInt();
            }
            completeTask(n, m, num);
        }

    }


//    Sample Input
//     15 6
//        2 5 6 7 9 4
//        Sample Output
//        1 8 11 13 15
//        3 10 12 14


