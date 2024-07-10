package linkedlist.leetcode.explorecard;

//Approach 2: One Pass
public class CQ19RemoveNthNodeFromLLEndApr2 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode prevNode = head;
            ListNode currNode = head;

            //move currNode n steps ahead
            for (int i = 0; i < n; i++) {
                currNode = currNode.next;
            }

            //edge case: remove 1st node = nth node from last
            if (currNode == null) return head.next;

            //move both pointers ahead until last node
            while (currNode.next != null) {
                currNode = currNode.next;
                prevNode = prevNode.next;
            }

            //de-link
            prevNode.next = prevNode.next.next;

            return head;
        }
    }
}
