package CodeFear;

public class StackLinkedList {

    static Node head = null;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;//next node will be null
        head = newNode;
    }

    public static void pop() {
        Node temp = head;
        head = head.next;
        System.out.println("popped item " + temp.data);

    }

    public static void printElements() {
        Node current = head;

        while (current != null) {
            System.out.println("itemsa are : " + current.data);
            current = current.next;
        }

    }

    public static void main(String[] args) {
        push(2);
        push(6);
        push(8);

        printElements();
        pop();
        printElements();
    }
}
