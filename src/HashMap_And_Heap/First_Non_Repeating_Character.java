package HashMap_And_Heap;
import java.util.*;
public class First_Non_Repeating_Character {
        public static int solution(String s) {
             HashMap<Character ,Integer > fmap= new HashMap<>() ;
              for(char ch:s.toCharArray()){
                   fmap.put(ch,fmap.getOrDefault(ch,0) +1);
              }
              for(int i=0; i<s.length();i++){
                   char ch = s.charAt(i);
                     if(fmap.get(ch)==1){
                         return i;
                     }
              }

            return -1;
        }

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            String s= scn.next();
            System.out.print(solution(s));
        }

    }


