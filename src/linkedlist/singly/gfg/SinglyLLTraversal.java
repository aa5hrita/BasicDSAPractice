package linkedlist.singly.gfg;


public class SinglyLLTraversal {
    public static void traverse(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Data: " + currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(11);
        Node first = new Node(12);
        Node second = new Node(13);
        Node third = new Node(14);

        head.next = first;
        first.next = second;
        second.next = third;

        System.out.println("Traversal -> ");
        traverse(head);
    }
}
