package BinarySearchTrees;

public interface Tree<T> {

    public void traversal();
    public void  insert(T data,Node<T> node);
    public void delete(T data);
    public T getMax();
    public T getMin();

}
