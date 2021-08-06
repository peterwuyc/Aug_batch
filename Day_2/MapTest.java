
import java.util.*;

public class MapTest {
    //2.实现
    // 增 ADD KEY VALUE;
    // 删 DELETE KEY;
    // 改 UPDATE KEY VALUE;
    // 查 SELECT KET;
    private static Map<Integer,String> map = new HashMap<>();

    public static void main(String[] args) throws Exception{
        while (true){
            Scanner sc = new Scanner(System.in);
            if(sc.hasNext()) {
                String input = sc.nextLine();
                String[] command = input.split(" ");

               switch (command[0]){
                   case "ADD" : case "UPDATE" :
                       try{
                           map.put(Integer.valueOf(command[1]), command[2]);
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       break;

                   case "DELETE" :
                       try {
                           if (map.remove(Integer.valueOf(command[1])) == null) System.out.println("No Such Key");
                           else System.out.println("Delete Successfully");
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       break;

                   case "SELECT" :
                       try{
                       System.out.println(command[1] + "," + map.get(Integer.valueOf(command[1])));
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       break;
                   default :
                       System.out.println("Invalid Command");
               }

            }
        }

    }
}
