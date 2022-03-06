package other;

public class LinkedListOps {
    // For Singly Linked Lists
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);
        insertbeg(node, 1);
        insertatend(node, 6);
        printLL(node);
    }

    public static void insertatend(Node node, int data) {
        Node newNode = new Node(data);
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void insertbeg(Node head, int data) {
        Node begnode = new Node(data);
        // Node temp = head;
        // head = begnode;
        // head.next = temp;
        begnode.next = head;
        head = begnode;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
    }

}