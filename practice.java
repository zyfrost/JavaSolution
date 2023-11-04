import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class practice {

  public static void main(String[] args) {
    /*
     
     * Queue - FIFO - First in First Out(ex. line of people)
     * A collection prior to holding data prior to processing
     * Linear data structure
     * add - enqueue (adds at end), offer()
     * remove - dequeue (remove from start),poll()
     * name of datastructure <the elements stack can hold> var_name = create new
     * instance of n.o.d<the element stack can hold> ();
     * Queue is a Interface 
     
     */

    Queue<String> queue = new LinkedList<String>();
    queue.offer("karen");// head
    queue.offer("chad");
    queue.offer("boomer");
    queue.offer("Harold");// tail
    System.out.println(queue.isEmpty());//false
    System.out.println(queue.size());
    System.out.println(queue.contains("Harold"));

    System.out.println(queue);
    queue.poll();//enqueue
    // we can use element to peek but it causes exception "NoSuchElementException"
    System.out.println(queue.peek());

    /*
     * Uses of Queue
     * 1. keyboard buffer
     * 2.Printer queue
     * 3.used in linked list , priority queues, breath-first search
     */

  }
}
