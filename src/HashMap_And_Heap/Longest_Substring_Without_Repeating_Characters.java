package HashMap_And_Heap;
import java.util.*;
import static java.lang.System.*;
public class Longest_Substring_Without_Repeating_Characters {
        public static int solution(String str) {
            int ans =0;
            int i=-1;
            int j=-1;
            HashMap<Character,Integer>map = new HashMap<>();
            while(true){   // accuire
                boolean f1=false;
                boolean  f2=false;
                while(i<str.length()-1){
                    f1=true;
                    i++;
                    char ch=str.charAt(i);
                    map.put(ch,map.getOrDefault(ch,0)+1);
                    if(map.get(ch)==2){
                        break;
                    }
                    else{
                        int len =i-j;
                        if(len>ans){
                            ans=len;
                        }
                    }
                }
// release
                while(j<i){
                    f2=true;
                    j++;
                    char ch=str.charAt(j);
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==1){
                        break;
                    }
                }
                if(f1==false && f2==false){
                    break;
                }
            }
            return ans;
        }


        public static void main(String[] args) {
            Scanner scn = new Scanner(in);
            String str = scn.next();
            out.println(solution(str));
        }

    }



