package HashMap_And_Heap;
import java.util.*;
public class Count_Of_Substrings_Having_At_Most_K_Unique_Characters {
    public static  int solutionfork1(String str){
        int ans =0;
        HashMap<Character ,Integer>map = new HashMap<>();
        int i=-1;
        int  j=-1;
        while(true){
            boolean f1= false;
            boolean f2 = false;

            while(i<str.length()-1){
                f1= true;
                i++;
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);


                if(map.size()==2){
                    removeInMap(map,ch);
                    i--;
                    break;
                }
            }
            while(j<i){
                f2 = true;
                if(map.size()==1){
                    ans+=i-j;
                }
                j++;
                char ch = str.charAt(j);
                removeInMap(map,ch);

                if(map.size()==0){
                    break;
                }

            }
            if(f1== false  && f2 == false){
                break;
            }


        }

        return ans;
    }


    public static int solution(String str, int k) {
            int ans =0;
            HashMap<Character,Integer> mapb = new HashMap<>();
            HashMap<Character,Integer>  maps = new HashMap<>();

            int is =-1;
            int ib =-1;
            int j=-1;

            while(true){

                boolean f1 = false;
                boolean f2 =  false;
                boolean f3 = false;

                while(ib<str.length()-1){
                    f1= true;
                    ib++;
                    char ch = str.charAt(ib);
                    mapb.put(ch,mapb.getOrDefault(ch,0)+1);

                    if(mapb.size()==k+1){
                        removeInMap(mapb,ch);
                        ib--;
                        break;
                    }
                }
                while(is<ib){
                    f2 = true;
                    is++;
                    char ch = str.charAt(is);
                    maps.put(ch,maps.getOrDefault(ch,0)+1);

                    if(maps.size()==k){
                        removeInMap(maps,ch);
                        is--;
                        break;

                    }
                }

                while(j<is){
                    f3 = true;
                    if(mapb.size()== k && maps.size()== k-1){
                        ans +=ib-is;
                    }

                    j++;
                    char ch = str.charAt(j);
                    removeInMap(maps,ch);
                    removeInMap(mapb,ch);

                    if(maps.size()< k-1 || mapb.size()<k){
                        break;
                    }
                }

                if(f1== false && f2== false  && f3 == false){
                    break;
                }
            }


            return ans;
        }


        public static void removeInMap(HashMap<Character,Integer> map,char ch){
            if(map.get(ch)==1){
                map.remove(ch);
            }
            else{
                map.put(ch,map.get(ch)-1);
            }
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            int k = scn.nextInt();
            System.out.println(solution(str,k));
        }

    }



//    Sample Input
//aabcbcdbca
//        2
//        Sample Output
//        23

// mera o/p  12 hai





  //website solution
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String str = scn.next();
//        int k = scn.nextInt();
//        System.out.println(solution(str,k));
//    }
//
//    public static int solution(String str, int k) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        int ans = 0;
//        for(int i = 0 , j = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//            map.put(ch,map.getOrDefault(ch, 0) + 1);
//            while(map.size() > k){
//                char chj = str.charAt(j);
//                map.put(chj,map.get(chj) - 1);
//                if(map.get(chj) == 0){
//                    map.remove(chj);
//                }
//                j++;
//            }
//            ans += (i - j + 1);
//        }
//        return ans;
//    }

//}




