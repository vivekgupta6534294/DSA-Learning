package linkedList;

public class Main {
    // public static class Person{
    //     String name;
    //     int age;
    // }
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        
        void addLast(int val){
            Node node=new Node();
            node.data=val;
            
            if(this.size==0){
                this.head=node;
                this.tail=node;
            }else{
                this.tail.next=node;
                this.tail=node;
            }
            this.size++;

        }
        int size(){
            return this.size;

        }
        void display(){
            Node ptr=this.head;
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }
            System.out.println();

        }
        void removeFirst(){
            if(this.size()==0)
                System.out.println("List is empty");
            else{
                Node nbr=this.head.next;
                this.head.next=null;
                this.head=nbr;
                this.size--;
            }

        }
        
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println(list.size());
        list.display();
        // Person p1=new Person();
        // System.out.println(p1.name +" "+p1.age);
        // p1.name="rohit";
        // p1.age=23;
        // System.out.println(p1.name +" "+p1.age);
    }
    
}
