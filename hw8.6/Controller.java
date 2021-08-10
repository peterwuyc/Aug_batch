package Spring;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws NullPointerException{
        static Map<Integer,String> map= new HashMap<Integer,String>();
        public static void main(String[] args) throws NullPointerException{
            while (true){
                Scanner sc = new Scanner(System.in);
                Service serv = new ServiceImpl();
                if(sc.hasNext()){
                    String input=sc.next();
                    String[] s= input.split("[,.]+");

                    switch(s[0].toUpperCase()){
                        case "ADD" : case "UPDATE" :
                            try{
                                serv.updateElementByKey(Integer.valueOf(s[1]), s[2]);
                            }
                            catch (Exception e){
                                System.out.println(e);
                            }
                            break;

                        case "DELETE" :
                            try {
                                serv.deleteElementByKey(Integer.valueOf(s[1]));
                            }
                            catch (Exception e){
                                System.out.println(e);
                            }
                            break;

                        case "SELECT" :
                            try{
                                if(s[1].toUpperCase()== "ALL") {
                                    serv.getAllElements();
                                }
                                else{
                                    System.out.println(s[1] + "," + serv.getElementByKey(Integer.valueOf(s[1])));
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
