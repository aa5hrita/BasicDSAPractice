package linkedlist.doubly.gfg;

public class DoublyLLDeletion {
    static Node deleteAtBeg(Node head) {
        head = head.next;
        head.prev = null;
        return head;
    }

    static void deleteAtPosition(Node curr, int position) {
        position = position - 1; //coz curr is already pointing to the next one
        int count = 0;

        while (curr != null && count != position) {
            curr = curr.next;
            count++;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }

    static void deleteAtEnd(Node head) {
        while (head.next != null) {
            head = head.next;
        }
        head.prev.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(11);
        Node second = new Node(12);
        Node third = new Node(13);
        Node fourth = new Node(14);
        Node fifth = new Node(15);
        Node sixth = new Node(16);

        head.next = first;
        first.prev = head;
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;
        fifth.next = sixth;
        sixth.prev = fifth;

        head = deleteAtBeg(head);
        deleteAtPosition(head, 3);
        deleteAtEnd(head);

        System.out.println("Forward Traversal -> ");
        DoublyLLTraversal2ways.forwardTraversal(head);
    }
}
