public class PublicAndStaticMethod{
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethods(){
        System.out.println("Public methods must be called creating objects");
    }

    public static void main(String[] args){
        myStaticMethod();
        PublicAndStaticMethod myObj = new PublicAndStaticMethod();
        myObj.myPublicMethods();
    }
}