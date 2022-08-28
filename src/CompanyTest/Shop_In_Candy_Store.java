package CompanyTest;
import java.util.*;
public class Shop_In_Candy_Store {
    class Solution{
        static ArrayList<Integer> candyStore(int candies[],int N,int K){
            // code here
            ArrayList<Integer> Al= new ArrayList<Integer>();
            Arrays.sort(candies);
            int mini = 0;
            int maxi = 0;

            for(int i=0; i<N; i++){
                mini += candies[i];
                N = N-K;
            }

            int sum=0;
            int m= candies.length;
            for(int i=m-1; i>=sum; i--){
                maxi += candies[i];
                sum+= K;
            }

            Al.add(mini);
            Al.add(maxi);

            return Al;

        }
    }
}
