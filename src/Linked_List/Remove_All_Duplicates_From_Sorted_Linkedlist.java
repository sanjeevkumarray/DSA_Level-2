package Linked_List;
import java.util.*;
public class Remove_All_Duplicates_From_Sorted_Linkedlist {

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

            ListNode nhead = new ListNode(-1);
            ListNode itr = nhead;
            itr.next = head;

            ListNode curr = head.next;

            while (curr != null) {
                boolean isLoopRun = false;
                while (curr != null && itr.next.val == curr.val) {
                    curr = curr.next;
                    isLoopRun = true;
                }

                if (isLoopRun)
                    itr.next = curr;
                else
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

//    Sample Input
//       12
//        1 1 1 4 5 6 6 7 8 9 9 9
//        Sample Output
//        4 5 7 8


//    82. Remove Duplicates from Sorted List II
//
//
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null)return head;
//
//        if(head.val != head.next.val){
//            head.next = deleteDuplicates(head.next);
//            return head;
//        }
//
//        while(head.next != null && head.val == head.next.val){
//            head = head.next;
//        }
//
//        return deleteDuplicates(head.next);
//    }
//}