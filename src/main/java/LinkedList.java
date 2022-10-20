public class LinkedList<T> {

  Node<T> head;

  public void add(T data) {
    Node<T> newNode = new Node<>();
    newNode.data = data;
    if (head == null) {
      head = newNode;
    } else {
      Node<T> tempNode = head;
      // 10 -> 20 -> 30 -> null
      while (tempNode.next != null) {
        tempNode = tempNode.next;
      }
      tempNode.next = newNode;
    }
  }

  public void addAtStart(T data) {
    Node<T> newNode = new Node<>();
    newNode.data = data;
    // 20 -> 30 -> null
    // 10 -> 20 -> 30 -> null
    newNode.next = head;
    head = newNode;
  }

  public void removeAtStart() {
    head = head.next;
  }

  public void remove() {
    if (head != null) {
      Node<T> tempNode = head;
      Node<T> tempNode2 = null;
      // 10 -> 20 -> 30 -> null
      while (tempNode.next.next != null) {
        tempNode = tempNode.next;
      }
      tempNode.next = null;
    }
  }

  public T get(int index) {
    if (index == 0) {
      return head.data;
    } else {
      Node<T> tempNode = head;
      for (int i = 0; i < index - 1; i++) {
        tempNode = tempNode.next;
      }
      return tempNode.data;
    }
  }
}
