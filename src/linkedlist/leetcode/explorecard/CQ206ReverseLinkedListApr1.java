package linkedlist.leetcode.explorecard;

//Approach 1: Iterative
public class CQ206ReverseLinkedListApr1 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode prevNode = null;
            ListNode currNode = head;

            while (currNode != null) {
                ListNode nextTemp = currNode.next; //save next node reference

                currNode.next = prevNode;//key logic for reversal
                prevNode = currNode;
                currNode = nextTemp; //atm currNode & nextTemp are same
            }
            return prevNode; //atm currNode=null & prevNode=last node
        }
    }

}
