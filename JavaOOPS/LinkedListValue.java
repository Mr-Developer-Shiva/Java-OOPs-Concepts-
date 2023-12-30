import java.util.LinkedList;
public class LinkedListValue{
    public static void main(String[] args){
        LinkedList<Integer> myLink  = new LinkedList<Integer>();
        myLink.add(76);
        myLink.add(556);
        myLink.add(64);
        myLink.add(34);
        System.out.println(myLink);
        for(int i = 0 ; i < myLink.size() ; i++){
            for(int j = 0;j<i;j++){
            System.out.print(i);
            }
            System.out.println();
        }
        for(int k : myLink){
            System.out.println( " " + myLink.get(0));
        }
    }
}