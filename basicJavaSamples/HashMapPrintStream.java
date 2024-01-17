import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapPrintStream {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Preety");
        map.put(2, "Mary");
        map.put(3, "Suzy");

//        System.out.println(map);

        Stream<Map.Entry<Integer,String>> entryStream = map.entrySet().stream();
        Stream<Integer> keySet = map.keySet().stream();
        Stream<String> values = map.values().stream();
        System.out.println(entryStream.collect(Collectors.toList()));
        System.out.println(keySet.collect(Collectors.toList()));
        System.out.println(values.collect(Collectors.toList()));
    }
}
