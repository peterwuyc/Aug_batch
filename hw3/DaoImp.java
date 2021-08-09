import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaoImp implements Dao{
    private Map<Integer,String> map;

    public DaoImp() {
        map  = new HashMap<Integer, String>();
    }

    @Override
    public List getAllElements() {
        if(map.keySet().size()==0){
            System.out.println("Empty Map");
        }

        for(Integer i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
        return null;
    }

    @Override
    public String getElementByKey(Integer key) throws Exception {
        if(!map.containsKey(key)){
            throw new Exception("Key does not exist");
        }else{
            return (map.get(key));
        }

    }


    @Override
    public void updateElementByKey(Integer key, String value) throws Exception {
        if(!map.containsKey(key)){
            throw new Exception("Key does not exist");
        }
        map.put(key,value);
    }

    @Override
    public void createElement(Integer key, String value) throws Exception {
        if(map.containsKey(key)){
            throw new Exception("Key exist");
        }
        map.put(key,value);
    }

    @Override
    public void deleteElementByKey(Integer key) throws Exception {
        if(!map.containsKey(key)){
            throw new Exception("Key does not exist");
        }
        map.remove(key);
    }
}
