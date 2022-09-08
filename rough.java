class Clone {
    //Function to clone a linked list with next and arb pointer.
    Node copyList(Node head) {
        // your code here
        
        
         Node curr = head;
        // Step 1 : Duplicate kr rha hu
        while (curr != null) {
            Node nbr = curr.next;
            Node clone = new Node(curr.val);
            curr.next = clone;
            clone.next = nbr;
            curr = nbr;
        }
        curr=head;
        // arb pointer set krunga
        while(curr!=null){
            Node future=curr.arb;
            if(future!=null)
                curr.next.arb=future.next;
            curr=curr.next.next;
        }
        curr=head;
        Node dummy=new Node(-1);
        Node ans=dummy;
        // 1 1 2 2 3 3 4 4 5 5
         //2 
        // -1 1  
        while(curr!=null){
            dummy.next=curr.next;
            dummy=dummy.next;
            curr.next=dummy.next;
            curr=curr.next;
        }
        dummy.next=null;
        ans=ans.next;
//         while(ans!=null){
//             System.out.println(ans.arb==null?"null":ans.arb.val);
//             ans=ans.next;
            
//         }
        // return ans.next;
        return head=ans;
        
        
    
    }
}

