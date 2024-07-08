package linkedlist.gfg.singly;


public class SinglyLLTraversal {
    public static void traverse(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Data: " + currentNode.data);
            currentNode = currentNode.next;
        }
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

        System.out.println("Traversal -> ");
        traverse(head);
    }
}
