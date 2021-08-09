import java.util.ArrayList;
import java.util.List;

public class ServiceImp implements Service {
    Dao dao = new DaoImp();
    @Override
    public List getAllElements() {
        List<String> elements = new ArrayList(dao.getAllElements());
        return elements;
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

    @Override
    public String getElementByKey(Integer key) {
        return dao.getElementByKey(key);
    }
}
