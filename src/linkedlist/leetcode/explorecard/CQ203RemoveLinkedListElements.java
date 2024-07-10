package linkedlist.leetcode.explorecard;

//Only Approach:  Sentinel Node
public class CQ203RemoveLinkedListElements {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            //sentinal node for edge case
            ListNode sentinel = new ListNode(0);
            sentinel.next = head;

            //pointers needed for removal during traversal - curr & prev
            ListNode prev = sentinel; //edge case: value present at 1st node, stores new head
            ListNode curr = head;

            while (curr != null) {
                if (curr.val == val) {
                    prev.next = curr.next; // key node removal logic
                } else {
                    prev = curr; //move forward
                }
                curr = curr.next; //move forward
            }
            return sentinel.next;
        }
    }


}
