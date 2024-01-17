public class CheckVowelsAdv {
    public static void main(String[] args) {
//        String s = "Preety";
        String s = "Prty";

        System.out.println(stringContainsVowel(s));

    }

    private static boolean stringContainsVowel(String s) {
        return s.toLowerCase().matches(".*[aeiou].*");
    }
}
