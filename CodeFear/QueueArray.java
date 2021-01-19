package CodeFear;

public class QueueArray {
public static final int size=5;
private Object  data[];
private int rear;
    public QueueArray(){
        data= new Object[size];
    }


    public boolean isEmpty(){
        return rear==0;
    }

    public void enque(Object item){

        if(rear==size-1){
            System.out.println("queue is full");
        }
        this.data[rear]= data;
        this.rear++;
    }

    private Object deque(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        Object data= this.data[0];
        for(int i=0;i<this.rear-1;i++){
           // data[i]= data[i+1];
        }
        this.rear--;
        return data;
    }

    public void print(){
        for(int i=0;i<data.length-1;i++){
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args) {
        QueueArray qa = new QueueArray();
        qa.enque(1);
        qa.enque(2);
        qa.enque(3);

        qa.print();


    }
}
