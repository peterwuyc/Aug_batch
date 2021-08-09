import java.util.*;

public class DapImpl implements Dao {

    private static Map<Integer, String> map = new HashMap<>();

    public DapImpl() {

    }

    @Override
    public List getAllElements() {
        while (!map.isEmpty()) {
            for (Object obj : map.keySet()) {
                Object key = obj;
                Object value = map.get(obj);
                System.out.println("key:" + key + ";value:" + value);
            }
        }
        return null;
    }

    @Override
    public String getElementByKey(Integer key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return "none";
    }

    @Override
    public void updateElementByKey(Integer key, String value) {
        map.put(key, value);
    }

    @Override
    public void createElement(Integer key, String value) {
        map.put(key, value);
    }

    @Override
    public void deleteElementByKey(Integer key) {
        map.remove(key);
    }
}
