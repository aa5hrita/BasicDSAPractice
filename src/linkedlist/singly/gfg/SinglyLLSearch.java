package linkedlist.singly.gfg;

public class SinglyLLSearch {

    public static boolean searchSinglyLL(Node currentNode, int target) {
        while (currentNode != null) {
            if (currentNode.data == target)
                return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(11);
        Node first = new Node(12);
        Node second = new Node(13);
        Node third = new Node(14);

        head.next = first;
        first.next = second;
        second.next = third;

        String result = searchSinglyLL(head, 44) ? "Found Data" : "Not found";
        System.out.println(result);

        String result2 = searchSinglyLL(head, 14) ? "Found Data" : "Not found";
        System.out.println(result2);
    }
}
