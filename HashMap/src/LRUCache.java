import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // if it returns true then last entry will remove
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Oggy", 89);
        studentMap.put("Bob", 78);
        studentMap.put("Jack", 67);
        //studentMap.get("Oggy");  // Oggy will return, but Bob will remove
        studentMap.put("Oggy", 100); // this is the latest entry, and bob is now the last entry, so bob will remove
        studentMap.put("Taplu", 78);

        studentMap.get("Oggy");  // we can't return get bcz Oggy already removed.

        System.out.println(studentMap);
    }
}
