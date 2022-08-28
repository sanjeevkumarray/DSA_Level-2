package CompanyTest;

public class Search_Insert_Position_Of_K_In_A_Sorted_Array {
}

class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        for(int i=0; i<Arr.length;i++){
            if(Arr[i]== k || Arr[i]>k) return i;
        }
        return  N;
    }


}

//   //class Solution
//  //{
//    static int searchInsertK(int arr[], int n, int k)
//    {
//        // code here
//        int low = 0;
//        int high = n - 1;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (arr[mid] == k) {
//                return mid;
//            }
//            if (arr[mid] > k) {
//                high = mid - 1;
//            }
//            else {
//                low = mid + 1;
//            }
//        }
//        return low;
//    }
//}