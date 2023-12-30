public class JavaConstractor{
       int x;
    public JavaConstractor(){
       x = 5;
    }
    public static void main(String args[]){
        JavaConstractor myConst = new  JavaConstractor();
        System.out.println(myConst.x);
    }
}