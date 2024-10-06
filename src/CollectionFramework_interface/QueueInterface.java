package CollectionFramework_interface;

import java.util.*;

public class QueueInterface {

    public static void main(String[] args){
        // use stack by using arraydeque to implement stack, it also has stack methods push or pop
//        ArrayDeque<Integer> stack= new ArrayDeque<>();
//        dq.offer(10);
//        dq.offerLast(20);
//        dq.offerFirst(30);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.pop();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(15);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
