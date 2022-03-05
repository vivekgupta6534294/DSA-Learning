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
    public static void insertbeg(Node head, int data) {
        // Node temp=head;
        // head.data=data;
        // head.next=temp;

        // Node begnode = new Node(data);
        // // Node temp = head;
        // // head = begnode;
        // // head.next = temp;
        // begnode.next = head;
        // head = begnode;


        Node temp=new Node(data);
        temp.next=head;
        head=temp;
    }
    public static void insertatend(Node node, int data) {
        Node newNode = new Node(data);
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
    }
    public static void main(String[] args) {
        Node node = new Node(2);
        node.next.data = 3;
        node.next.next.data = 4;
        node.next.next.next.data = 5;
        insertbeg(node, 1);
        insertatend(node, 6);
        printLL(node);

    }
}