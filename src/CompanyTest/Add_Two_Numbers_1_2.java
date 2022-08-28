package CompanyTest;

public class Add_Two_Numbers_1_2 {

    //Add Two Numbers

//    class Solution {
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            ListNode dummy = new ListNode(0);
//            ListNode curr = dummy;
//            int carry = 0;
//            while(l1 != null || l2 != null || carry == 1){
//                int sum = 0;
//                if(l1 != null){
//                    sum += l1.val;
//                    l1 = l1.next;
//                }
//                if(l2 != null){
//                    sum += l2.val;
//                    l2 = l2.next;
//                }
//                sum += carry;
//                carry = sum/10;
//                ListNode node = new ListNode(sum % 10);
//                curr.next = node;
//                curr = curr.next;
//            }
//            return dummy.next;
//        }
//    }
}


//    Add Two Numbers II


//  class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode res = new ListNode(0);
//        ListNode temp = res;
//        l1 = reverse(l1);
//        l2 = reverse(l2);
//        int carry = 0;
//        while (l1 != null || l2 != null) {
//            if (l1 != null) {
//                carry += l1.val;
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                carry += l2.val;
//                l2 = l2.next;
//            }
//            temp.next = new ListNode(carry % 10);
//            temp = temp.next;
//            carry /= 10;
//        }
//        if (carry != 0) temp.next = new ListNode(carry);
//        return reverse(res.next);
//    }
//
//    private ListNode reverse(ListNode node) {
//        ListNode pre = null;
//        while (node != null) {
//            ListNode next = node.next;
//            node.next = pre;
//            pre = node;
//            node = next;
//        }
//        return pre;
//    }
//}


//
//Maximum GCD of siblings of a binary tree
//class Solution {
//    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N){
//        int res=0;
//        arr.sort((a,b)->a.get(0)-b.get(0));
//        for(int i=1 ;i< arr.size();i++)
//        {
//            if(arr.get(i).get(0)==arr.get(i-1).get(0))
//            {
//                res=Math.max(res,gcd(arr.get(i).get(1),arr.get(i-1).get(1)));
//            }
//        }
//        return res;
//    }
//    static int gcd(int a,int b)
//    {
//        return b == 0 ? a : gcd(b, a % b);
//    }
//
//};