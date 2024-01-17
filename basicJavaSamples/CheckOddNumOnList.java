import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckOddNumOnList {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(2,3,4,5);
//        List<Integer> ls = Arrays.asList(1,3,5);
        getOddNum(ls);
        System.out.println("List contains only odd numbers: "+onlyOddNumbers(ls));
    }

    private static void getOddNum(List<Integer> ls) {
        ls
               .stream()
               .filter(x -> x % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);

    }

    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }
}
