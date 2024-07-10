package linkedlist.leetcode.explorecard;


//Only Approach:
public class CQ328OddEvenLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public ListNode oddEvenList(ListNode head) {

            if (head == null) return null;

            //to begin with two lists ODDLIST & EVENLIST
            //initialise its head and tail
            ListNode oddHead = head, oddTail = oddHead;
            ListNode evenHead = head.next, evenTail = evenHead;

            // we need a curr ptr for traversal -> evenTail
            while (evenTail != null && evenTail.next != null) {

                //append odd list & update odd tail ptr
                oddTail.next = evenTail.next;
                oddTail = oddTail.next;
                //append even list & update even tail ptr
                evenTail.next = oddTail.next;
                evenTail = evenTail.next;

            }

            //join both lists
            oddTail.next = evenHead;

            return head;
        }
    }


}
