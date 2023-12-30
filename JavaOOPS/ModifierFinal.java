public class ModifierFinal{
    final int myNumber = 10 ;
    final String myName = "Shiva";
    public static void main(String[] args){
        ModifierFinal  obj = new ModifierFinal();     
        System.out.println(obj.myNumber);
        System.out.println(obj.myName);
        obj.myPublicMethod();
        myStaticMethod();
    }
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects ");
    }
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects ");
    }
   
}