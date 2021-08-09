import java.util.List;

public interface Dao {
    List getAllElements(); String getElementByKey(Integer key) throws Exception;
    void updateElementByKey(Integer key,String value) throws Exception;
    void createElement(Integer key,String value) throws Exception;
    void deleteElementByKey(Integer key) throws Exception;
}
