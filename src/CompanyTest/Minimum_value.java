package CompanyTest;
import java.io.*;
import java.util.*;
public class Minimum_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ans = Math.min(ans, x);
        }
        System.out.println(ans);
    }

}
  // input
    // 2
   // 0
//  5
//o/p

//0

//
//#include<bits/stdc++.h>
//        using namespace std;
//        int main() {
//        // your code goes here
//        int n, ans=INT_MAX, x;
//        cin>>n;
//        for(int i=0; i<n;i++){
//        cin>>x;
//        ans=min(ans,x);
//        }
//        cout<<ans;
//        return 0;
//        }

