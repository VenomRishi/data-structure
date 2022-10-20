public class Queue<T> {

  private LinkedList<T> list = new LinkedList<>();
  private int pointer = 0;

  public void add(T data) {
    list.add(data);
    pointer++;
  }

  public void remove() {
    list.removeAtStart();
    pointer--;
  }

  public T peek() {
    return list.get(pointer);
  }
}
