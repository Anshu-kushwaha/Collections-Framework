import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Anshu");
        map.put(2, "Komal");
        map.put(3, "Mohit");
        map.put(4, "Jiya");

        System.out.println(map);

//        String student = map.get(3); // check who is in 3
//        System.out.println(student);
/*
        String s = map.get(6); // check whether 6 is present or not -> null if not
        System.out.println(s);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Anshu"));


//      ---------------THERE IS NO ANY ORDER IN HASHMAP IT CAN USE ANY ORDER OF NAME---------------

 */

        Set<Integer> keys = map.keySet();   // show all name of students
        for (int i : keys) {
            System.out.println(map.get(i));

            // to print all values

            Set<Map.Entry<Integer, String>> entries = map.entrySet();
            for (Map.Entry<Integer, String> entry : entries){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

//            String remove = map.remove(4);
//            System.out.println(remove);
        }
    }
}