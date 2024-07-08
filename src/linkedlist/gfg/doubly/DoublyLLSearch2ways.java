package linkedlist.gfg.doubly;

public class DoublyLLSearch2ways {

    private static void backwardSearch(Node tail, int target) {
        while (tail != null) {
            if (tail.data == target) {
                System.out.println("Data Found");
            }
            tail = tail.prev;
        }
    }

    private static void forwardSearch(Node head, int target) {
        while (head != null) {
            if (head.data == target) {
                System.out.println("Data Found");

            }
            head = head.next;
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

        System.out.println("Forward Search -> ");
        forwardSearch(head, 13);

        System.out.println("Backward Search -> ");
        backwardSearch(sixth, 15);

    }


}
