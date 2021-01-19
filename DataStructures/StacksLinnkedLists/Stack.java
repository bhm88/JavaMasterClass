package DataStructures.StacksLinnkedLists;

public class Stack<T extends Comparable<T>> {
    private Node<T> root;
    private int count;


    public void push(T data){
this.count++;
        if (root==null){
            this.root= new Node<T>(data);
        }
        else{
            Node<T> oldroot=this.root;
            this.root=new Node<>(data);
            this.root.setNextRef(oldroot);
        }
    }

    public T pop(){
        T popItem=this.root.getData();
        this.root=this.root.getNextRef();
        this.count--;
        return popItem;
    }


    public T peek(){
        return this.root.getData();
    }

    public int size(){
        return this.count;
    }

    public boolean isEmpty(){
       return this.root==null;
    }
}
