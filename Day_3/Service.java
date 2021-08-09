import java.util.List;

public interface Service {
    List getAllElements(); // 对返回值进行排序，按照升序返回结果 String getElementByKey(Integer key);
    void updateElementByKey(Integer key,String value);
    void createElement(Integer key,String value);
    void deleteElementByKey(Integer key);
    String getElementByKey(Integer key);
}
