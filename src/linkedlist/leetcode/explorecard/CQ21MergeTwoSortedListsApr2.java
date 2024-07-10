package linkedlist.leetcode.explorecard;

public class CQ21MergeTwoSortedListsApr2 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead; //holds last node of smaller list for merging with the longer one later

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next; // move prev after merging one node until last node of smaller list
        }

        // At least one of l1 and l2 can still have nodes at this point, so connect
        // the non-null list to the end of the merged list (=prev ptr).
        prev.next = list1 == null ? list2 : list1;

        return prehead.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
