package linkedlist.leetcode.explorecard;

//Approach 2: Recursive
public class CQ206ReverseLinkedListApr2 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode p = reverseList(head.next);
            head.next.next = head; // key logic n(k).next is n(k+1),  n(k+1).next = n(k)
            head.next = null;
            return p;
        }
    }
}
