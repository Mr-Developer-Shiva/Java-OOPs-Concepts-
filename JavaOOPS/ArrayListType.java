import java.util.ArrayList;
public class ArrayListType{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println(numbers.size());
        for(Integer i : numbers)
        {
            System.out.println(i);
        }
    }
}