package linkedlist.leetcode.explorecard;

//Approach 1: Two pointers (at different speeds - a slow pointer and a fast pointer)
//Floyd's Cycle Finding Algorithm
public class CQ141LinkedListCycle1Apr2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) {
                return false;
            }

            ListNode slow = head;
            ListNode fast = head.next; // edge case: single node - return false

            while (slow != fast) {
                if (fast == null || fast.next == null) { //handles NPE
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }
}
