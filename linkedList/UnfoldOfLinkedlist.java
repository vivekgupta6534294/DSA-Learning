// nados Intermediate
import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

     public static void unfold(ListNode head) {
        ListNode dummy1=new ListNode(-1);
        ListNode list1=dummy1;
        ListNode dummy2=new ListNode(-1);
        ListNode list2=dummy2;
        boolean flag=true;
        ListNode curr=head;
        while(curr!=null){
            if(flag){
                list1.next=curr;
                list1=list1.next;
                                
            }else {
                list2.next=curr;
                list2=list2.next;
            }
            curr=curr.next;
            flag=!flag;
        }
        list1.next=null;
        list2.next=null;

        list2=reverse(dummy2.next);
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
            temp.next=list2;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}