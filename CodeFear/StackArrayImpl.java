package CodeFear;

public class StackArrayImpl {
    int size = 100;
    int arr[] = new int[size];
    int top;

    public StackArrayImpl() {
        top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("underflow");

            return 0;
        } else {
            int x = arr[top--];
            return x;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }


    private boolean push(int data) {
        if (top >= (size - 1)) {
            System.out.println("overflow");
            return false;
        } else {
            arr[++top] = data;
            System.out.println("pushed to stack");
            return true;
        }

    }

    public static void main(String[] args) {
        StackArrayImpl s = new StackArrayImpl();
        s.push(2);
        s.push(5);
        s.push(789);
        s.print();
        System.out.println(s.pop());
        s.print();
    }
}
