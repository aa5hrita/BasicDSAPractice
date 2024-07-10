package linkedlist.leetcode.explorecard;

//Approach 1: Two Pass
public class CQ19RemoveNthNodeFromLLEndApr1 {

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

            int length = 0;
            ListNode currNode = head;

            // find the length of LL
            while (currNode != null) {
                length++;
                currNode = currNode.next;
            }
            if (length == n) return head.next; //edge case: delete 1st node or 4th from last (n=4)

            //Find the index of node before the node to be removed

            int indexOfPrevNode = length - n - 1;
            currNode = head;

            for (int i = 0; i < indexOfPrevNode; i++) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next; //de-link
            return head;
        }
    }
}
