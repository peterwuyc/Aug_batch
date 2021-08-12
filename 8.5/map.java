import java.util.*;

public class map {
    public static Object findKey(Map map, Object value) {
        List<Object> keys = new ArrayList<>();
        for (Object key : map.keySet()) {
            if (map.get(key).equals(value)) {
                keys.add(key);
            }
        }
        return keys;
    }

    private static Map<Integer, String> map = new HashMap<>();

    //
    public static void main(String[] args) throws NullPointerException {
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "ccc");
        map.put(4, "ddd");
        System.out.println(map);

        map.remove(4);
        System.out.println(map);

        map.put(1, "modify");
        System.out.println(map);

        System.out.println(map.get(3));
        // System.out.println(check);
        System.out.println(findKey(map, "bbb"));

    }
}
