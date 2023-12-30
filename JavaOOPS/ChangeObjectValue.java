public class ChangeObjectValue{
    int x = 7;
    public static void main(String[] args){
        ChangeObjectValue  myObj = new ChangeObjectValue();
        ChangeObjectValue myObj2 = new ChangeObjectValue();
        myObj2.x = 100;
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
    } 
}