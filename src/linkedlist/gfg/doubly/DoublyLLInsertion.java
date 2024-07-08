package linkedlist.gfg.doubly;

public class DoublyLLInsertion {

    static void insertEnd(Node head, int value) {
        Node newNode = new Node(value);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;

    }

    static Node insertBeginning(Node head, int value) {

        Node newNode = new Node(value);
        head.prev = newNode;
        newNode.next = head;

        return newNode;
    }

    static void insertAtPosition(Node head, int position) {
        int count = 0;
        while (head != null && count != position) {
            count++;
            head = head.next;
        }
        Node newNode = new Node(444);
        newNode.prev = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;
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

        head = insertBeginning(head, 1010);
        insertAtPosition(head, 4);
        insertEnd(head, 8888);

        System.out.println("Forward Traversal -> ");
        DoublyLLTraversal2ways.forwardTraversal(head);
    }
}
