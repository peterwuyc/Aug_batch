import java.util.List;

public interface Dao {
    List getAllElements();
    String getElementByKey(Integer key);
    void updateElementByKey(Integer key, String value);
    void createElement(Integer key, String value);
    void deleteElementByKey(Integer key);
}
