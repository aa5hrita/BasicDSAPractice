package linkedlist.leetcode.explorecard;

import java.util.HashSet;
import java.util.Set;

//Approach 2: Hash Table
public class CQ160IntersectionTwoLLsApr2 {

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
            Set<ListNode> nodesInB = new HashSet<ListNode>();

            //stores all node references in LL B
            while (headB != null) {
                nodesInB.add(headB);
                headB = headB.next;
            }

            while (headA != null) {
                // if we find the node pointed to by headA,
                // in our set containing nodes of B, then return the intersecting node
                if (nodesInB.contains(headA)) {
                    return headA;
                }
                headA = headA.next;
            }

            return null;
        }
    }
}
