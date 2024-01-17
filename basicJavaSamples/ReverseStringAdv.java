import java.util.Scanner;

public class ReverseStringAdv {
    public static void main(String[] args) {
        //String s = "Preety";
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if( s == null) {
            throw new IllegalArgumentException("Null value not accepted");
        }else{
        System.out.println(reverseString(s));}
    }

    private static String reverseString(String s) {
        StringBuilder sbr = new StringBuilder(s);
        return sbr.reverse().toString();
    }

}
//https://www.digitalocean.com/community/tutorials/java-programming-interview-questions