import java.util.*;

public interface Service {
    List<String> getAllElements(); 

    String getElementByKey(Integer key);

    void updateElementByKey(Integer key, String value);

    void createElement(Integer key, String value);

    void deleteElementByKey(Integer key);
}
