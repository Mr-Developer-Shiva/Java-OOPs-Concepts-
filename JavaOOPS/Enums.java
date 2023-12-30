public class Enums{
    enum Level{
            LOW,MEDIUM,HIGH
        }
    public static void main(String[] args){
       
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
        Level myVar1 = Level.LOW;
        System.out.println(myVar1);
        Level myVar2 = Level.HIGH;
        System.out.println(myVar2);
    }
}
