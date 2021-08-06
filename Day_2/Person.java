//1.创建类Person，其中存储的成员数据为:age(int),sex(boolean),weight(int)，至少有一个构造函数可以初始化这三个属性值，同时提供获取这三个属性值的public方法
public class Person {
    private int age;
    private boolean sex;
    private int weight;

    public Person() {}
    public Person(int age, boolean sex, int weight){
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }
    public boolean getSex(){
        return sex;
    }

    public int getWeight() {
        return weight;
    }
}
