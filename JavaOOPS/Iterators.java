import java.util.ArrayList;
import java.util.Iterator;
public class Iterators {
    public static void main(String args[]){

        Iterators myObj = new Iterators();
        myObj.iteratorNumber();

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("BMW");

       Iterator<String> it = cars.iterator();
     //   System.out.println(it.next());

     /*Loop Through a collection ...............*/
     while (it.hasNext()) {
        System.out.println(it.next());
     }
    }

    public void iteratorNumber(){
         ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(34);
        numbers.add(768);
        numbers.add(79);
        numbers.add(345);

       Iterator<Integer> it = numbers.iterator();
       //System.out.println(it.next());
       while(it.hasNext()){
        Integer i = it.next();
        if(i<10){
            it.remove();
        }
       }
       System.out.println(numbers);
    }
}
