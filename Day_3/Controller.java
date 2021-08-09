import java.util.Scanner;


//main 方法调用 service 实现类， service 实现类调用 Dao 实现类。对map 进行增删改查操作
public class Controller {
    public static void main(String[] args) {
        Service service = new ServiceImp();
        while (true){
            Scanner sc = new Scanner(System.in);
            if(sc.hasNext()) {
                String input = sc.nextLine();
                String[] command = input.split(" ");

                switch (command[0]){
                    case "ADD" : case "UPDATE" :
                        try{
                            service.updateElementByKey(Integer.valueOf(command[1]), command[2]);
                        }
                        catch (Exception e){
                            System.out.println(e);
                        }
                        break;

                    case "DELETE" :
                        try {
                            service.deleteElementByKey(Integer.valueOf(command[1]));
                        }
                        catch (Exception e){
                            System.out.println(e);
                        }
                        break;

                    case "SELECT" :
                        try{
                            if(command[1] == "ALL") {
                                service.getAllElements();
                            }
                            else{
                                System.out.println(command[1] + "," + service.getElementByKey(Integer.valueOf(command[1])));
                            }
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
