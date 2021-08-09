# Aug_batch

//1.创建类Person，其中存储的成员数据为:age(int),sex(boolean),weight(int)，至少有一个构造函数可以初始化这三个属性值，同时提供获取这三个属性值的public方法

//2.实现  增删改查 +List
private static Map<Integer,String> map=new HashMap<>();


public static void main(String[] args) throws NullPointerException{
    while (true){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            String input=sc.next();
        }
    }
}

//3 作业
Dao 实现类声明静态变量 （模拟数据库 存储数据）private static Map<Integer,String> map=new HashMap<>();

main 方法调用 service 实现类， service 实现类调用 Dao 实现类。对map 进行增删改查操作

public interface service{
  List<String> getAllElements(); // 对返回值进行排序，按照升序返回结果
  String getElementByKey(Integer key);
  void updateElementByKey(Integer key,String value);
  void createElement(Integer key,String value);
  void deleteElementByKey(Integer key);
  
}

    
public interface Dao{
  List<String> getAllElements();
  String getElementByKey(Integer key);
  void updateElementByKey(Integer key,String value);
  void createElement(Integer key,String value);
  void deleteElementByKey(Integer key);
}
    
// 
举例
    
 public static void main(String[] args) throws NullPointerException{
    ServiceImpl s=new ServiceImpl();
    while (true){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            String input=sc.next();
        //解析input
        if(是添加数据){
           s.createElement(.....)
        }
        }
    }
}   
 public class DaoImpl implements Dao {
    private static Map<Integer,String> map=new HashMap<>();
   
    @Override
    public createElement(Integer key,String value){
        map.put(key,value);
    }
    
    //。。。。其他实现方法
  }
