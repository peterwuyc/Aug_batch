package Spring;

import java.util.List;

public class ServiceImpl implements Service {
    Dao dao = new DaoImplement();

    public ServiceImpl(){

    }

    @Override
    public void updateElementByKey(Integer key, String value) {
        dao.updateElementByKey(Integer key, String value);
    }

    @Override
    public void deleteElementByKey(Integer key) {
         dao.deleteElementByKey();
    }

    @Override
    public String getElementByKey(Integer key) {
        return dao.getElementByKey( Integer key);
    }

    @Override
    public void createElement(Integer key, String value) {
        dao.createElement(Integer key, String value);
    }

    @Override
    public List getAllElements() {
        return dao.getAllElements();
    }
}
