package Spring;

import java.util.List;

public interface Dao {
    List getAllElements();
    String getElementByKey(Integer Key);
    Void updateElementByKey(Integer key,String value);
    void createElement(Integer Key,String value);
    void deleteElementByKey(Integer key);
}
