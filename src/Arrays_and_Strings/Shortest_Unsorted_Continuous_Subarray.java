package Arrays_and_Strings;
import java.util.*;
public class Shortest_Unsorted_Continuous_Subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

    }

    public int findUnsortedSubarray(int[] nums) {
        int end =-1;
        int max=nums[0];
        for(int i=0; i<nums.length;i++){
            if(max>nums[i]){
                end=i;
            }
            else {
                max=nums[i];
            }
        }
        int st=0;
        int min =nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>min){
                st=i;
            }
            else {
                min=nums[i];
            }
        }
        return  end-st+1;
    }


}