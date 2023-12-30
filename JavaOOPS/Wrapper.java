public class Wrapper{
    public static void main(String[] srgs){
        myValues();
        Integer myInt = 5;
        Character ch ='M';
        Double myDouble = 78.94;
        
        System.out.println(myInt);
        System.out.println(ch);
        System.out.println(myDouble);
         IntergerToString();
    }

    static void myValues(){
         Integer myInt = 5;
        Character ch ='M';
        Double myDouble = 78.94;
        
        System.out.println(myInt.intValue());
        System.out.println(ch.charValue());
        System.out.println(myDouble.doubleValue());
    }
    static void IntergerToString(){
        Integer num = 10;
        String name = num.toString();
        System.out.println(name.length());
    }
}