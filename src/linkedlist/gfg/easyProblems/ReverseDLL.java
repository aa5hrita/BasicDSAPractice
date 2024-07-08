package linkedlist.gfg.easyProblems;

public class ReverseDLL {

    public static DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null)
            return head;

        DLLNode curr = head, prev = null, next = null;

        while (curr != null) {
            // save original link ptr values of curr node
            prev = curr.prev;
            next = curr.next;

            //swapping the prev and next pointers of the current node
            curr.prev = next;
            curr.next = prev;

            //moving the current node to its previous node (actually next)
            curr = next; //=curr.prev
        }
        //returning the previous node of head as the new head (the last node after reversing the list)
        return prev.prev;

    }

}
