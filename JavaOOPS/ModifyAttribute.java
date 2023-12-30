public class ModifyAttribute{
    int x = 5;                                  // x = 5
    public static void main(String[] args){
        ModifyAttribute myObj = new ModifyAttribute(); //use the class name to create an object method
        myObj.x = 100;                  // Use the dot(.)Syntex
        System.out.println(myObj.x + ":") ; // change the value of x = 100;
        // x is now 100.
    }
}