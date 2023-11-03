import java.util.Stack;

public class practice {

  public static void main(String[] args) {
    // Stack - LIFO - Last in First Out
    // it stores data in vertical tower form
    // push() is to add at the top
    // pop() is remove from the top
    // name of datastructure <the elements stack can hold> var_name = create new
    // instance of n.o.d<the element stack can hold> ();
    Stack<String> stack = new Stack<String>();
    stack.push("Minecraft");
    stack.push("Doom");
    stack.push("Eternal");
    stack.push("Animal Crossing");

    System.out.println(stack.peek());
    //first position in stack starts from one
        System.out.println(stack.search("Doom"));

    String myFavGame = stack.pop();
    System.out.println(myFavGame);
  }
}
