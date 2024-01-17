import java.util.*;

public class SortList {
    public static void main(String[] args) {
        String s[] ={"Preety","Amy","Lisa", "Amy"};

        List<String> arr = Arrays.asList(s);
        System.out.println(arr);

        Set<String> strSet = new HashSet<String>(arr);
        System.out.println(strSet);

        TreeSet<String> treeSet = new TreeSet<>(strSet);
        System.out.println(treeSet);

    }
}
