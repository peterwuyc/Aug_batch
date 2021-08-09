package Spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaoImplement implements Dao{
    private static Map<Integer,String> map=new HashMap<>();

    @Override
    public void createElement(Integer Key, String value) {
        map.put(key,value);
    }

    @Override
    public String getElementByKey(Integer Key) {
        return map.get(key);
    }

    @Override
    public List getAllElements() {
        for (String i: map.keySet()){
            System.out.print(i);
            System.out.println(map.get(i));
        }
    }

    @Override
    public void deleteElementByKey(Integer key) {
        map.remove(key);
    }

    @Override
    public Void updateElementByKey(Integer key, String value) {
        map.remove(Key);
        map.put(key,value);
    }
}
