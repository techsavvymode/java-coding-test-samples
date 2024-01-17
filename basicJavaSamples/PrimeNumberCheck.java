public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrimeNum(811));
    }

    private static boolean isPrimeNum(int n) {
        if(n == 0 || n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= n/2; i++) {
            System.out.println(n+" "+i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
