package HashMap_And_Heap;
// 914. X of a Kind in a Deck of Cards
import java.util.*;
public class X_Of_A_Kind_In_A_Deck_Of_Cards {

    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i=0; i<deck.length;i++){
                map.put(deck[i],map.getOrDefault(deck[i],0)+1);
            }
            int ans =0;
            for(int key:map.keySet()){
                ans=gcd(ans,map.get(key));
            }

            if(ans>=2){
                return true;
            }
            else{
                return false;
            }
        }

        public int gcd(int  a, int b){
            if(b==0){
                return a;
            }

            return gcd(b,a%b);
        }

    }

}
