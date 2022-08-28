package Linked_List;
import java.util.*;
public class Palindrome_Linkedlist {
        public static class ListNode {
            int val = 0;
            ListNode next = null;

            ListNode(int val) {
                this.val = val;
            }
        }
        public static ListNode midNode (ListNode head){
            if(head== null || head.next == null) return head;
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next!= null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
        public static ListNode  reverseOfLL(ListNode head){
            if(head== null || head.next == null ) return head;

            ListNode prev = null;
            ListNode curr = head;
            ListNode frow = null;

            while(curr!=null){
                frow =curr.next;
                curr.next = prev;
                prev = curr;
                curr= frow;
            }
            return prev;
        }

        public static boolean isPalindrome(ListNode head) {
            if(head== null || head.next== null ) return true;
            ListNode mid = midNode(head);
            ListNode mHead = mid.next;
            mid.next = null;
            mHead =reverseOfLL(mHead);
            ListNode c1= head;
            ListNode c2= mHead;

            boolean res = true;
            while( c1 != null && c2!=null){
                if(c1.val!= c2.val){
                    res= false;
                    break;
                }

            c1= c1.next;
            c2= c2.next;

        }

        mHead = reverseOfLL(mHead);
        mid.next = mHead;
        return res;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        System.out.println(isPalindrome(dummy.next));
    }
}

//    Sample Input
//        10
//        5
//        1
//        4
//        6
//        9
//        9
//        6
//        4
//        1
//        5
//        Sample Output
//        true

