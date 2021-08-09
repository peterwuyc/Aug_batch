import java.util.*;

public class DaoImp implements Dao {
    private static Map<Integer, String> map = new HashMap<Integer,String>();

    @Override
    public List getAllElements() {    // 对返回值进行排序，按照升序返回结果
        List<String> elements = new ArrayList<>();
        for(Map.Entry<Integer, String> entry :  map.entrySet()){
            elements.add(map.get(entry.getKey()));
        }
        Collections.sort(elements);
        return elements;
    }

    @Override
    public String getElementByKey(Integer key) {
        return map.get(key);
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
