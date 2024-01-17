import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapFindAll {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");
        books.put("978-0134685902", "Effective Java");
        books.put("978-0134685901", "Effective Java");

        Stream<String> values = books.values().stream().filter(x -> x.equals("Effective Java"));
        values.forEach(System.out::println);

        List<String> findNextMatchAll = books.entrySet().stream()
                .filter(x->x.getValue().equals("Effective Java"))
                .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
        findNextMatchAll.forEach(System.out::println);
    }
}
