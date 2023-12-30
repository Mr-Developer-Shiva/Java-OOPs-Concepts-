interface firstInterface{
    public void myMethod();
}
interface secondInterface{
    public void myOtherMethod();
}
class Demo implements firstInterface,secondInterface{
        public void myMethod(){
            System.out.println("Some Text.....");
        }
        public void myOtherMethod(){
            System.out.println("Some Other Text.......");
        }
}
class MultiInterface{
    public static void main(String[] args){
        Demo myDemo = new Demo();
        myDemo.myMethod();
        myDemo.myOtherMethod();
    }
}