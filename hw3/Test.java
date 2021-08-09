import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    static Map<Integer,String> map = new HashMap<Integer, String>();
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        Service ser = new ServiceImp();
        while(true){
            String str = scanner.next();
            try{
                input(str,ser);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                printHelpMenu();
            }
        }
    }
    public static void input(String str,Service ser) throws Exception{

        String[] s = str.split(",");
        if(s[0].toUpperCase().equals("ADD") && s.length==3){
            int i = getNumber(s[1]);
            //add(i,s[2]);
            ser.createElement(i,s[2]);
        }
        else if(s[0].toUpperCase().equals("GET")&& s.length==2){
            int i = getNumber(s[1]);
            ser.getElementByKey(i);
        }
        else if(s[0].toUpperCase().equals("UPDATE")&& s.length==3){
            int i = getNumber(s[1]);
            ser.updateElementByKey(i,s[2]);
        }
        else if(s[0].toUpperCase().equals("DELETE")&& s.length==2){
            int i = getNumber(s[1]);
            ser.deleteElementByKey(i);
        }
        else if(s[0].toUpperCase().equals("LIST")&& s.length==1) {
            ser.getAllElements();
        }else{
            throw new Exception("Wrong input");
        }
    }
    public static void add(int i,String val) throws Exception{
        if(map.containsKey(i)){
            throw new Exception("Key exist");
        }
        map.put(i,val); 
    }

    public static void get(int i) throws Exception{
        if(!map.containsKey(i)){
            throw new Exception("Key does not exist");
        }
        System.out.println(map.get(i));
    }

    public static void update(int i,String val) throws Exception{
        if(!map.containsKey(i)){
            throw new Exception("Key does not exist");
        }
        map.put(i,val);
    }

    public static void delete(int i) throws Exception{
        if(!map.containsKey(i)){
            throw new Exception("Key does not exist");
        }
        map.remove(i);
    }

    public static void printMap() throws Exception{
        if(map.keySet().size()==0){
            System.out.println("Empty Map");
        }
        for(Integer i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
    }
    public static int getNumber(String str) throws Exception{
        return Integer.valueOf(str);
    }
    public static void printHelpMenu(){
    }
}
