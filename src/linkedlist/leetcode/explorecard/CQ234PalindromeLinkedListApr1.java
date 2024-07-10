package linkedlist.leetcode.explorecard;

import java.util.ArrayList;
import java.util.List;

//Approach 1: Copy into Array List and then Use Two Pointer Technique
public class CQ234PalindromeLinkedListApr1 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            List<Integer> nodesList = new ArrayList<>();
            ListNode currentNode = head;

            // Convert LinkedList into ArrayList
            while (currentNode != null) {
                nodesList.add(currentNode.val);
                currentNode = currentNode.next;
            }

            // Use two-pointer technique to check for palindrome
            int front = 0;
            int back = nodesList.size() - 1;
            while (front < back) {
                // Note that we must use ! .equals instead of !=
                // because we are comparing Integer, not int.
                if (!nodesList.get(front).equals(nodesList.get(back))) {
                    return false;
                }
                front++;
                back--;
            }
            return true;
        }
    }


}