import java.util.*;

public interface Dao {
    List<String> getAllElements();

    String getElementByKey(Integer key);

    void updateElementByKey(Integer key, String value);

    void createElement(Integer key, String value);

    void deleteElementByKey(Integer key);
}
