import java.util.List;

public class ServiceImp implements Service{
    Dao dao = new DaoImp();

    public ServiceImp( ){

    }
    @Override
    public List getAllElements() {
        return dao.getAllElements();
    }

    @Override
    public String getElementByKey(Integer key) throws Exception {
        return dao.getElementByKey(key);
    }

    @Override
    public void updateElementByKey(Integer key, String value) throws Exception {
        dao.updateElementByKey(key,value);
    }

    @Override
    public void createElement(Integer key, String value) throws Exception {
        dao.createElement(key,value);
    }

    @Override
    public void deleteElementByKey(Integer key) throws Exception {
        dao.deleteElementByKey(key);
    }
}
