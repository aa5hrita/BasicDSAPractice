package linkedlist.gfg.easyProblems;

public class ReverseLinkedList2Ways {

    public static void main(String[] args) {
        ReverseLinkedList2Ways x = new ReverseLinkedList2Ways();
        SLLNode head = new SLLNode(111);
        head = x.reverseSLL(head);
        x.printReverseSLL(head);
    }

    /*
    Approach 1: Reverse a linked list by Iterative Method:
    */
    SLLNode reverseSLL(SLLNode head) {
        SLLNode prev = null;
        SLLNode current = head;
        SLLNode next;

        while (current != null) {

            next = current.next; // move next pointer
            current.next = prev; // for backward traversal
            prev = current; // move prev pointer
            current = next; //move current pointer , now current=next

        }
        head = prev; // when current=null, prev -> tail node = our new head
        return head;
    }

    /*
    Print linked list using recursion in reverse order
    */
    void printReverseSLL(SLLNode head) {
        if (head == null)
            return;

        printReverseSLL(head.next);

        System.out.println("Data: " + head.data);
    }
}
