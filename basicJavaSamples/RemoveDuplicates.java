import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s[] ={"Preety","Amy","Lisa", "Amy"};

        List<String> arr = Arrays.asList(s);
        System.out.println(arr);

        Set<String> strSet = new HashSet<String>(arr);
        System.out.println(strSet);

    }
}
