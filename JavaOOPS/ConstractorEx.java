public class ConstractorEx{
    int x ;
    String myName;
    public ConstractorEx(int year,String Name){
       x =year;
       myName = Name;
    }
    public static void main(String[] args){
        ConstractorEx myCon = new ConstractorEx(1995,"Java");
        System.out.println("The Name of language: "+ myCon.myName);
        System.out.println("The Name of Year: "+ myCon.x);
    }
}