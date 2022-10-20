public class Stack<T> {

  private LinkedList<T> list = new LinkedList<>();
  private int pointer = 0;

  public void push(T data) {
    list.add(data);
    pointer++;
  }

  public void pop() {
    list.remove();
    pointer--;
  }

  public T peek() {
    return list.get(pointer);
  }
}
