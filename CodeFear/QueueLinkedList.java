package CodeFear;

public class QueueLinkedList {
    Node front;
    Node rear;

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (rear == null) {
            this.rear = this.front = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;

    }

    public Node deque() {
        if (front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;

        }
        return temp;
    }

    public void print(QueueLinkedList ql) {
        Node current = ql.front;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        ql.print(ql);
        System.out.println(ql.deque().data);
        System.out.println("printing");
        ql.print(ql);
    }
}
