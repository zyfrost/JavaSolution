import java.util.LinkedList;
import java.util.Scanner;

public class practice {
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<String>();
    // * this is Treating Linkedlist as Stack
    /*
     * ^linkedList.push("A");
     * ^linkedList.push("B");
     * ^linkedList.push("C");
     * ^linkedList.push("D");
     * ^linkedList.push("F");
     * ^linkedList.pop();
     */
    // * This is treating linkedlist as Queue
    linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    linkedList.offer("F");
    // linkedList.poll();
    // *
    linkedList.add(4, "E");
    linkedList.remove(4);
    // *
    System.out.println(linkedList.peekFirst());
    System.out.println(linkedList.peekLast());
    // *
    linkedList.addFirst("0");
    linkedList.addLast("G");
    // *
    String First = linkedList.removeFirst();
    String Last = linkedList.removeLast();

    // *
    System.out.println(linkedList);
  }
}
/*
 * Linked List = Stores Nodes in 2 parts ( data + address )
 * nodes are stored in non - consecutive memory locations
 * Elements are linked using pointers
 * Singly Linked List
 * Node
 * [ data | address ] -> [ data | address ] -> [ data | address ]
 * Doubly Linked list
 * Node
 * [ data | address ] <-> [ data | address ]
 * 
 * advantages
 * 1.dynamic memory allocation(allocates needed memory)
 * 2.Insertion and deletion of nodes is easy
 * 3. NO memory waste accessing and searching
 * Disadvantages
 * 1.Greater memory usage (additional pointer)
 * 2.No random acess elements(no index [i])
 * 3.accessing/storing elements is more time consuming O(n)(array and arraylist are at adva.)
 * uses
 * 1.implement Stacks / queues
 * 2.GPS navigation
 * 3.music playlists
 */
