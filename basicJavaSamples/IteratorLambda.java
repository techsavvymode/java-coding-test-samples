import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorLambda {
    public static void main(String[] args) {
        int[] arr = {1,6,3,2};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.forEach(v->{
            System.out.println(v);
        });

    }
}
