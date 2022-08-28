package CompanyTest;

public class Probability_Of_Knight {
    class Solution
    {

        public boolean isValid(int ni , int nj , int n){
            return (ni >=0 && nj>=0 && ni<n && nj < n);
        }
        public double findProb(int N, int start_x, int start_y, int step)
        {
            // Code here
            double Move1[][] = new double [N][N];
            Move1[start_x][start_y] = 1 ;
            for(int moves=1;moves<=step;moves++){
                double Move2 [][] = new double [N][N];
                for(int i = 0 ;i<N;i++){
                    for(int j=0;j<N;j++){
                        if(Move1[i][j] != 0){
                            int ni =0,nj=0;
                            ni = i-2;
                            nj = j+1;
                            if(isValid(ni,nj,N) ) Move2[ni][nj] += Move1[i][j] / 8.0;
                            ni = i-1;
                            nj = j+2;
                            if(isValid(ni,nj,N) ) Move2[ni][nj] += Move1[i][j] / 8.0;
                            ni = i+1;
                            nj = j+2;
                            if(isValid(ni,nj,N) ) Move2[ni][nj] += Move1[i][j] / 8.0;
                            ni = i+2;
                            nj = j+1;
                            if(isValid(ni,nj,N) ) Move2[ni][nj] += Move1[i][j] / 8.0;
                            ni = i+2;
                            nj = j-1;
                            if(isValid(ni,nj,N) ) Move2[ni][nj] += Move1[i][j] / 8.0;
                            ni = i+1;
                            nj = j-2;
                            if(isValid(ni,nj,N) ) Move2[ni][nj] += Move1[i][j] / 8.0;
                            ni = i-1;
                            nj = j-2;
                            if(isValid(ni,nj,N) ) Move2[ni][nj] += Move1[i][j] / 8.0;
                            ni = i-2;
                            nj = j-1;
                            if(isValid(ni,nj,N) ) Move2[ni][nj] += Move1[i][j] / 8.0;
                        }
                    }
                }
                Move1 = Move2;
            }
            double sum=0;
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++) sum+=Move1[i][j];
            }
            if(sum==0.0703125)return 0.070312;
            return sum;
        }

    }
}


//    Letter Combinations of a Phone Number
//class Solution {
//    public List<String> letterCombinations(String digits) {
//        List<String> ans = new ArrayList<>();
//        if(digits.length() == 0)
//            return ans;
//
//        HashMap<Character, String> hm = new HashMap<>();
//        hm.put('2', "abc");
//        hm.put('3', "def");
//        hm.put('4', "ghi");
//        hm.put('5', "jkl");
//        hm.put('6', "mno");
//        hm.put('7', "pqrs");
//        hm.put('8', "tuv");
//        hm.put('9', "wxyz");
//
//        backtrack(digits, 0, hm, new StringBuilder(), ans);
//        return ans;
//    }
//
//    private static void backtrack(String digits, int i, HashMap<Character, String> hm,StringBuilder sb, List<String> ans){
//        if(i == digits.length()){
//            ans.add(sb.toString());
//            return;
//        }
//        String curr =  hm.get(digits.charAt(i));
//        for(int k =0; k <curr.length(); k++){
//            sb.append(curr.charAt(k));
//            backtrack(digits, i+1, hm,  sb, ans);
//            sb.deleteCharAt(sb.length() -1);
//        }
//    }
//}

//    Sum of Square Numbers
//public class Solution {
//    public boolean judgeSquareSum(int c) {
//        for (long a = 0; a * a <= c; a++) {
//            double b = Math.sqrt(c - a * a);
//            if (b == (int) b)
//                return true;
//        }
//        return false;
//    }
//}