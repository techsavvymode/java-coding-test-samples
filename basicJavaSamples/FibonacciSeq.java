public class FibonacciSeq {
    public static void main(String[] args) {
        int a=0, b=1, c=1;

        for (int i = 0; i <=10 ; i++) {
            System.out.print(a+" ");
            a = b;
            b = c;
            c = a+b;
        }
    }
}
