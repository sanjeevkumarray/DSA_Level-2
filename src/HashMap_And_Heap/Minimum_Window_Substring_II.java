package HashMap_And_Heap;
import java.util.*;
public class Minimum_Window_Substring_II {
        public static int solution(String str){
            int len =str.length();
            HashSet<Character> set = new HashSet<>();
            for(int i=0; i<str.length();i++){
                char  ch = str.charAt(i);
                set.add(ch);
            }

            int i=-1;
            int j=-1;
            HashMap<Character,Integer> map = new HashMap<>();
            while(true){
                boolean f1= false;
                boolean f2 = false;
                // accure till it is invaild (map.size()< set.size()))

                while(i<str.length()-1 &&  map.size() < set.size()){
                    i++;
                    char ch = str.charAt(i);
                    map.put(ch,map.getOrDefault(ch,0)+1);
                    f1= true;
                }

// collect and release

                while(j<i && map.size() == set.size()){
                    int plen= i-j;
                    if(plen < len){
                        len = plen;
                    }
                    j++;
                    char ch = str.charAt(j);
                    if(map.get(ch)==1){
                        map.remove(ch);
                    }
                    else{
                        map.put(ch,map.get(ch)-1);
                    }
                    f2= true;
                }

                if(f1== false  && f2== false){
                    break;

                }
            }

            return  len;

        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            System.out.println(solution(str));
        }

    }


