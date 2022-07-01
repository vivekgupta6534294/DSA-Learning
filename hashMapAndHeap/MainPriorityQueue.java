package hashMapAndHeap;

import java.util.Scanner;
import java.util.*;
public class MainPriorityQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PQIntro();
        
    }
    public static void PQIntro(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println(pq);
        pq.add(10);
        // System.out.println(pq);
        pq.add(-1);
        // System.out.println(pq);
        pq.add(2);
        // System.out.println(pq);
        pq.add(15);
        // System.out.println(pq);
        pq.add(3);
        // System.out.println(pq);
        pq.add(6);
        // System.out.println(pq);
        pq.add(4);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());

        while(pq.size() > 0){
            System.out.print(pq.remove()+" ");
        }
    }
}
