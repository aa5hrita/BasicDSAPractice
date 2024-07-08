package linkedlist.gfg.singly;

public class SinglyLLInsertion3Ways {
    public static Node insertAtBeg(Node head) {

        Node newNode = new Node(989);
        newNode.next = head.next;
        return newNode;

    }

    public static void insertAtEnd(Node node) {

        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(777);
    }

    public static void insertAtPosition(Node position, Node node) {

        while (node.next != position) {
            node = node.next;
        }
        Node newNode = new Node(565);
        newNode.next = position;
        node.next = newNode;

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

        head = insertAtBeg(head);
        insertAtEnd(head);
        insertAtPosition(third, head);

        SinglyLLTraversal.traverse(head);

    }

}
