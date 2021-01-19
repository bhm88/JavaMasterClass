package BinarySearchTrees;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;
    public void insertNode(T data){
        if(root==null){
            this.root= new Node<T>(data);
        }
        else{
            insert(data,root);
        }

    }
    @Override
    public void traversal() {

    }

    @Override
    public void insert(T data,Node<T> node) {
        if(data.compareTo(node.getData())<0){
            if(node.getLeftChild()!=null){
                insert(data,node.getLeftChild());
            }
            else{
                Node<T> newNode=new Node<>(data);
                node.setLeftChild(newNode);
            }

        }
        else{
            if(node.getRightChild()!=null){
                insert(data,node.getRightChild());
            }
            else{
                Node<T> newNode=new Node<>(data);
                node.setRightChild(newNode);
            }
        }

    }

    @Override
    public void delete(T data) {

    }

    @Override
    public T getMax() {
        return null;
    }

    @Override
    public T getMin() {
        return null;
    }
}
