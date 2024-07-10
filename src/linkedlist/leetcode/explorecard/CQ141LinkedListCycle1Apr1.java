package linkedlist.leetcode.explorecard;

import java.util.HashSet;
import java.util.Set;

//Approach 1: Hash Table/Hash Set
public class CQ141LinkedListCycle1Apr1 {

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
            Set<ListNode> nodesSeen = new HashSet<>();
            ListNode current = head;
            while (current != null) {
                if (nodesSeen.contains(current)) {
                    return true;
                }
                nodesSeen.add(current);
                current = current.next;
            }
            return false;
        }
    }


}
