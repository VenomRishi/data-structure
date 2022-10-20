import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Runner {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);

    list.remove();

    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    System.out.println(stack.peek());
    stack.push(20);
    System.out.println(stack.peek());
    stack.push(30);
    System.out.println(stack.peek());

    stack.pop();
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());

  }
}
