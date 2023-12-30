import java.util.HashMap;
public class HashMapType{
    public static void main(String[] args){
        HashMap<String,Integer> people = new HashMap<String,Integer>();
        people.put("Shiva",21);
        people.put("Valar",23);
        people.put("Maari",20);
        people.put("Ushama",20);

        for(String i : people.keySet()){
            System.out.println("Key: " + i  + " \nValue: " + people.get(i));
        }
    }
}