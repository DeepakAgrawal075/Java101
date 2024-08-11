import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * The MapDemo class demonstrates the differences between HashMap and LinkedHashMap.
 * It shows how HashMap does not maintain any order of its entries, while LinkedHashMap
 * maintains the insertion order of its entries.
 */
public class MapDemo {
    public static void main(String[] args) {
        // Create and populate a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        // Print the HashMap
        System.out.println("HashMap (unordered): " + hashMap);

        // Create and populate a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);
        // Print the LinkedHashMap
        System.out.println("LinkedHashMap (ordered): " + linkedHashMap);
    }
}