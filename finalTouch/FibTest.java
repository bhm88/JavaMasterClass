package finalTouch;

public class FibTest {

    public static void fib(int n){
        int f1=0;
        int f2=1;
        for(int i=1;i<=n;i++){
            System.out.println(f1);
            int sum=f1+f2;
            f1=f2;
            f2=sum;
        }




    }
    public static void main(String[] args) {
        int n=10;
        fib(n);
    }
}
