public class FibonacciSeqAdv {

    //recursive
    public static void main(String[] args) {

        int n = 10;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) +" ");
        }

    }

    public static int fibonacciRecursion(int n) {
        if (n <= 1)
                return n;
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }

