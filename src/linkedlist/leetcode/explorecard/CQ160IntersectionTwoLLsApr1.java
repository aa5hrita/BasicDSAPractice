package linkedlist.leetcode.explorecard;

//Approach 1: Brute Force
//This is not a good approach for an interview
public class CQ160IntersectionTwoLLsApr1 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            while (headA != null) {
                ListNode pB = headB;
                while (pB != null) {
                    if (headA == pB) return headA;
                    pB = pB.next;
                }
                headA = headA.next;
            }
            return null;
        }
    }
}
