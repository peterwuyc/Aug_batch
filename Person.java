package CreatingClass;

public class Person {
    private int age;
    private boolean gender;
    private int weight;

    public Person(int age, boolean gender, int weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
