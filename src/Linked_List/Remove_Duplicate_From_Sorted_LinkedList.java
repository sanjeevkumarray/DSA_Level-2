package Linked_List;
import java.util.*;
public class Remove_Duplicate_From_Sorted_LinkedList {

        public static Scanner scn = new Scanner(System.in);

        public static class ListNode {
            int val = 0;
            ListNode next = null;

            ListNode(int val) {
                this.val = val;
            }
        }

        public static ListNode removeDuplicates(ListNode head) {
            if (head == null || head.next == null)
                return head;

            ListNode nhead = new ListNode(-1000);
            ListNode itr = nhead;
            ListNode curr = head;

            while (curr != null) {
                while (curr != null && itr.val == curr.val)
                    curr = curr.next;

                itr.next = curr;

                itr = itr.next;
                if (curr != null)
                    curr = curr.next;
            }

            return nhead.next;
        }

        // InFput_code===================================================

        public static void printList(ListNode node) {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }

        public static ListNode makeList(int n) {
            ListNode dummy = new ListNode(-1);
            ListNode prev = dummy;
            while (n-- > 0) {
                prev.next = new ListNode(scn.nextInt());
                prev = prev.next;
            }

            return dummy.next;
        }

        public static void main(String[] args) {
            ListNode head = makeList(scn.nextInt());

            ListNode ans = removeDuplicates(head);
            printList(ans);
        }

    }

    //
//    Sample Input
//      12
//        1 1 1 4 5 6 6 7 8 9 9 9
//        Sample Output
//        1 4 5 6 7 8 9


//  83. Remove Duplicates from Sorted List
//class Solution{
//    public ListNode deleteDuplicates(ListNode head){
//        if(head== null || head.next== null)  return head;
//
//        ListNode  count = deleteDuplicates(head.next);
//        while(count!=null && count.val== head.val){
//            count=count.next;
//        }
//        head.next= count;
//        return head;
//
//    }
//}


//     82. Remove Duplicates from Sorted List II
//
//public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null)return head;
//
//        if(head.val != head.next.val){
//        head.next = deleteDuplicates(head.next);
//        return head;
//        }
//
//        while(head.next != null && head.val == head.next.val){
//        head = head.next;
//        }

//        return deleteDuplicates(head.next);
//        }