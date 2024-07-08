package linkedlist.gfg.doubly;

public class DoublyLLTraversal2ways {

    public static void forwardTraversal(Node head) {
        while (head != null) {
            System.out.println("Data: " + head.data);
            head = head.next;
        }
    }

    public static void backwardTraversal(Node tail) {
        while (tail != null) {
            System.out.println("Data: " + tail.data);
            tail = tail.prev;
        }
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

        System.out.println("Forward Traversal -> ");
        forwardTraversal(head);

        System.out.println("Backward Traversal -> ");
        backwardTraversal(sixth);

    }
}
