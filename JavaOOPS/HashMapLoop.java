import java.util.HashMap;

public class HashMapLoop{
    public static void main(String[] args){
         HashMap<String,String> str = new HashMap<String,String>();

        str.put("England","London\n");
        str.put("Germany","Berlin\n");
        str.put("Norway","Oslo\n");
        str.put("USA","Washington DC\n");

        for (String i : str.keySet()){
            System.out.println(i);
        }
        for(String j : str.values() ){
            System.out.println(j);
        }
        for(String k : str.keySet()){
            System.out.println("Key: " + k + " \nValues: "  + str.get(k));
        }
    }
}