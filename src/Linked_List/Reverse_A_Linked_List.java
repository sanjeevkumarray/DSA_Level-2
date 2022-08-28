package Linked_List;
import java.util.*;
public class Reverse_A_Linked_List {
        public static class ListNode {
            int val = 0;
            ListNode next = null;
            ListNode(int val) {
                this.val = val;
            }
        }

        public static ListNode reverse(ListNode head) {
              if(head==null || head.next== null) return  head;
                 ListNode  curr = head;
                 ListNode  prev = null;
                 ListNode  forw = null;

                 while(curr!=null){
                      forw =curr.next;
                       curr.next = prev ;
                       prev= curr;
                        curr= forw;
                 }

            return  prev ;
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

            ListNode head = reverse(dummy.next);
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
        }
    }


//    Sample Input
//      7
//        1 2 3 4 5 6 7
//        Sample Output
//        7 6 5 4 3 2 1