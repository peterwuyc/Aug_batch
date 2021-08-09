import java.util.*;

public class ServiceImpl implements Service {
    Dao dao = new DapImpl();

    public ServiceImpl() {

    }

    @Override
    public List getAllElements() {
        return dao.getAllElements();
    }

    @Override
    public String getElementByKey(Integer key) {
        return dao.getElementByKey(key);
    }

    @Override
    public void updateElementByKey(Integer key, String value) {
        dao.updateElementByKey(key, value);
    }

    @Override
    public void createElement(Integer key, String value) {
        dao.createElement(key, value);
    }

    @Override
    public void deleteElementByKey(Integer key) {
        dao.deleteElementByKey(key);
    }
}
