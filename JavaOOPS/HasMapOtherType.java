import java.util.HashSet;
public class HasMapOtherType {
    public static void main(String[] args){
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(3);
        values.add(7);
        values.add(8);
        values.add(87);

        for(int i = 0 ;i <= 10 ;i++){
         
                if(values.contains(i)){
                    System.out.println(i + " Was is found");
                }else{
                    System.out.println(i+ " it is not found");
                }
            }
        }
    }
