import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class HashMapFind {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");
        books.put("978-0134685902", "Effective Java");
        books.put("978-0134685901", "Effective Java");
//        System.out.println(map);

        //Stream<Map.Entry<Integer,String>> entryStream = map.entrySet().stream();
       // Stream<Integer> keySet = map.keySet().stream();
        Stream<String> values = books.values().stream().filter(x -> x.equals("Effective Java"));
        values.forEach(System.out::println);

        //System.out.println(entryStream.collect(Collectors.toList()));
        //System.out.println(keySet.collect(Collectors.toList()));
        //System.out.println(values.collect(Collectors.toList()));

//        Optional<String> findMatch = books.entrySet()
//                .stream().filter(x -> x.getValue().equals("Effective Java"))
//                .map(Map.Entry::getKey)
//                .findFirst();
//        System.out.println(findMatch.get());

        Optional<String> findNextMatch = books.entrySet().stream()
                .filter(x->x.getValue().equals("Effective Java"))
                .map(Map.Entry::getKey)
                .findAny();
        System.out.println(findNextMatch.get());
    }
}
