package linkedlist.singly.gfg;

public class SinglyLLDeletion3ways {
    public static Node deleteAtBeg(Node head) {
        head = head.next;
        return head;
    }

    public static void deleteAtEnd(Node node) {
        Node prev = node;
        while (node.next != null) {
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }

    public static void deleteAtPosition(Node position, Node node) {
        Node prev = node;
        while (node != position) {
            prev = node;
            node = node.next;
        }
        prev.next = node.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(11);
        Node second = new Node(12);
        Node third = new Node(13);
        Node fourth = new Node(14);
        Node fifth = new Node(15);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        head = deleteAtBeg(head);
        deleteAtEnd(head);
        deleteAtPosition(third, head);

        SinglyLLTraversal.traverse(head);

    }

}
