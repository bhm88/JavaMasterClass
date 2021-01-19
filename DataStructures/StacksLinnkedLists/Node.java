package DataStructures.StacksLinnkedLists;

public class Node<T extends Comparable<T>>{
    private T data;
    private Node<T> nextRef;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextRef() {
        return nextRef;
    }

    public void setNextRef(Node<T> nextRef) {
        this.nextRef = nextRef;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
