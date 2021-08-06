
public class person {

    // class PersonInfo {
    private int id;
    private int age;
    private int weight;
    private boolean sex;

    public person() {
    }

    public person(int id, int age, int weight, boolean sex) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    // public PersonInfo() {
    // age = 0;
    // sex = true;
    // weight = 0;
    // }
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getSex() {
        return sex;
    }

    // }

    // public person(){
    // }

    // //to store personinfo
    // private static Map<Integer, String> map = new HashMap<>();

    // public static void main(String[] args) {

    // // map.remove()

    // // public static void main(String[] args) throws NullPointerException{
    // // while (true){
    // // Scanner sc = new Scanner(System.in);

    // // if(sc.hasNext()){
    // // String input=sc.next();
    // // }
    // // }
    // // }
    // }
}