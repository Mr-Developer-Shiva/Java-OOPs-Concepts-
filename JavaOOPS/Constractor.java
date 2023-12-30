public class Constractor{
    String carName;
    int year;
    public Constractor(){
        carName = "Tesla";
        year = 2014;
    }
    public static void main(String[] args){
        Constractor myConst = new Constractor();
        System.out.println("Name: "+myConst.carName+"\n" +"Years of: " + myConst.year);
    }
}