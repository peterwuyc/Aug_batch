import java.util.List;

public interface Service {
    List getAllElements(); // 对返回值进行排序，按照升序返回结果
    String getElementByKey(Integer key) throws Exception;
    void updateElementByKey(Integer key,String value) throws Exception;
    void createElement(Integer key,String value) throws Exception;
    void deleteElementByKey(Integer key) throws Exception;
}
