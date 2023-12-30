public class ConstractorParameter{
    int x ;
    
    public ConstractorParameter(int y){
        x = y;
    }
    public static void main(String args[]){
        ConstractorParameter myConst = new ConstractorParameter(5);
        System.out.println(myConst.x);
    }
}