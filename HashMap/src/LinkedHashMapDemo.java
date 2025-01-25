import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.8f, true); // double linked list
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Orange", 30);
        linkedHashMap.put("Grapes", 10);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Grapes");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Grapes");   // using this we can know the recent item


        // in HashMap order isn't maintain, but it maintains in LinkedHashMap

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
