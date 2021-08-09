public class Person {
    private String name;
    private int age;
    private int sex;
    private int weight;
    private int length;

    public Person(String name, int age, int sex, int weight, int length) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
