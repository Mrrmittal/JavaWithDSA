package Collections.Queue.PiorityQueue;

import java.util.PriorityQueue;

public class Initialize {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(90);
        priorityQueue.add(25);
        priorityQueue.add(87);
        priorityQueue.add(100);
        priorityQueue.add(100); //Duplicates are allowed
//        priorityQueue.add(null); Null not allowed\

        System.out.println(priorityQueue);
    }
}
