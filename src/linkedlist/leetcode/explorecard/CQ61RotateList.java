package linkedlist.leetcode.explorecard;

public class CQ61RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        //base edge cases
        if (head == null) return null;
        if (head.next == null) return head;

        // close the linked list into the ring
        ListNode old_tail = head;
        int n; //size of LL
        for (n = 1; old_tail.next != null; n++) old_tail = old_tail.next;
        //make LL into a ring
        old_tail.next = head;

        // find new tail : (n - k)th node
        // and new head : (n - k + 1)th node = new tail's next node
        ListNode new_tail = head;
        k = k % n;   //edge case input
        for (int i = 1; i < n - k; i++) new_tail = new_tail.next; // = kth node

        // Initialise new head
        ListNode new_head = new_tail.next; // = k+1 th node

        // break the ring
        new_tail.next = null;

        return new_head;
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
