import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class practice {

  public static void main(String[] args) {
    /*
     * Priority Queue = FIFO Data Structure , that serves elements based with
     * highest priority first before lower priority
     */

    Queue<Double> queue = new PriorityQueue<>();

    queue.offer(3.0);
    queue.offer(4.0);
    queue.offer(2.5);
    queue.offer(1.6);

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }

    /*
     * Uses of Queue
     * 1. keyboard buffer
     * 2.Printer queue
     * 3.used in linked list , priority queues, breath-first search
     */

  }
}
