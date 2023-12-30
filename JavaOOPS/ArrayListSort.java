import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort{
    public static void main(String[] args){
       
        ArrayList<String> name = new ArrayList<String>();
        name.add("Volvo");
        name.add("BMW");
        name.add("Ford");
        name.add("Mazda");
            Collections.sort(name);
        for(String i : name){
            System.out.println(i);
        }


         
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(34);
        nums.add(55);
        nums.add(12);
        nums.add(87);
        nums.add(31);

        Collections.sort(nums);
        for(int i : nums){
            System.out.println(i);
            
            
        }
    }
}