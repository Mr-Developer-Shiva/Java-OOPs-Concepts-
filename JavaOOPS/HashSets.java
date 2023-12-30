import java.util.HashSet;
public class HashSets{
    public static void main(String[] args){
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    System.out.println(cars);
    // cars.contains(cars);
    // System.out.println(cars);
    // cars.remove("BMW");
    //  System.out.println(cars);
    //  cars.clear();
    //  System.out.println(cars);
   
    // System.out.println(cars.size());
    
    //Loop Type for each

    for(String i : cars){
        System.out.println(i);
    }
    }
}