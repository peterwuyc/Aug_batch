import java.util.*;

public class main {
    public static void main(String[] args) throws NullPointerException {
        ServiceImpl s = new ServiceImpl();
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNext()) {
                String input = sc.next();

                String[] inputs = input.split(",");
                // //解析input
                // if(是添加数据){
                // s.createElement(.....)
                // }
                if (inputs[0].toUpperCase().equals("ADD")) {
                    s.createElement(Integer.valueOf(inputs[1]), inputs[2]);
                }
            }
        }
    }
}
