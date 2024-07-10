package linkedlist.leetcode.explorecard;

public class CQ2AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0); //result List
        ListNode currNode = dummyHead; //result List
        int carry = 0;

        while (list1 != null || list2 != null || carry != 0) {
            int x = (list1 != null) ? list1.val : 0;
            int y = (list2 != null) ? list2.val : 0;
            int sum = carry + x + y; //key formula
            carry = sum / 10; //key logic - get quotient
            currNode.next = new ListNode(sum % 10); //key logic to construct result List uses remainder
            currNode = currNode.next;
            if (list1 != null) list1 = list1.next;
            if (list2 != null) list2 = list2.next;
        }

        return dummyHead.next; //result List real head ptr

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
