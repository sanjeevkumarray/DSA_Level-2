package CompanyTest;

public class Partition_A_Number_Into_Two_Divisible_Parts {

    class Solution{
        static String stringPartition(String S, int a, int b){
            // code here
            int n=S.length()-1;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n ; i++){
                sb.append(S.charAt(i));
                int p = Integer.parseInt(sb.toString());
                int q = Integer.parseInt(S.substring(i+1));
                if( p % a == 0 && q % b == 0)return sb + " " + S.substring(i+1);
            }
            return "-1";
        }
    }
}
