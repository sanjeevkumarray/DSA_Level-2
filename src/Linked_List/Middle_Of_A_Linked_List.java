package Linked_List;
import java.util.*;
public class Middle_Of_A_Linked_List {
        public static class ListNode {
            int val = 0;
            ListNode next = null;
            ListNode(int val) {
                this.val = val;
            }
        }

        public static ListNode midNode(ListNode head) {
           if(head== null || head.next == null ) return  head;
            ListNode  slow =head;
            ListNode  fast = head;
            while(fast.next!=null  &&  fast.next.next!= null){
                 slow=slow.next;
                 fast =fast.next.next ;
            }
            return  slow ;
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

            ListNode head = midNode(dummy.next);
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
        }
    }


//    Sample Input
//        7
//        1 2 3 4 5 6 7
//        Sample Output
//        4 5 6 7
