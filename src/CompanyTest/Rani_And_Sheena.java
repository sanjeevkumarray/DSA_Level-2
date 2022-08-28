package CompanyTest;
import  java.io.*;
import java.util.*;
public class Rani_And_Sheena {
    public static  void  main(String[] args) throws Exception{
//        Scanner sc= new Scanner (System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int a=sc.nextInt();
//            int n=sc.nextInt();
//            int[] nums = new int [n];
//            for(int i=0; i<n;i++){
//                nums[i]=sc.nextInt() ;
//            }
//            int target=0;
//            int[] ans =twoSum(nums,target);
//            System.out.println(ans);
//        }
//    }
//
//    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            if(hm.containsKey(target-nums[i]))
//            {
//                return new int[]{i,hm.get(target-nums[i])};
//            }
//            hm.put(nums[i],i);
//        }
//        return (new int[]{});




          //new method
        Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int  n=sc.nextInt();
            int [] nums = new int [n];
            for(int i=0; i<n;i++){
                nums[i]=sc.nextInt() ;
            }
            int low =0,  high =n-1;
            int   rem =Integer.MAX_VALUE;
            int lt=0;
            int rt =0;
            while(low<high){
                int temp=a-(nums[low]+nums[high]);
                if(temp<rem && temp>=0){
                    rem= temp;
                    lt=low+1;
                    rt =high+1;
                }
                if(nums[low]+nums[high]<a)low++;
                else  if(nums[low]+nums[high]>a)high--;
                else if(nums[low]+nums[high]==a) break;
            }

            System.out.print(lt + " " + rt );
            System.out.println();
        }
    }
}

